# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-f88d249c-f3a7-42ab-b7d2-6e92d3b9ad1a` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-0042148f-d8d5-4997-99a4-322a4c97d58a` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-379d1acb-3ef2-4016-b529-4fa70ab5de77` |
| 4 | `POST /v1/auth/token` | 200 | 8 | `qa-062f5fea-852b-4708-b85d-244c0d37d487` |
| 5 | `POST /v1/conversations` | 201 | 5 | `qa-8d102aca-0a85-4382-b4b4-1168253fbe14` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-948eef8a-3a9c-4870-81a4-5fc37cef97c9` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 5 | `qa-de16f841-2a80-402f-9f4e-463a49b0119c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-d737e6c1-b42c-44f3-8fc5-b689c8fec759` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-184a9cb6-4628-4860-b6b1-14404439a320` |
| 10 | `POST /v1/auth/token` | 200 | 28 | `qa-b39c797b-64ed-41ab-9ad6-945b78b1c798` |
| 11 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-f2b8aca3-1fb7-408c-8c33-7dd76c6989e4` |
| 12 | `POST /v1/auth/token` | 401 | 27 | `qa-96f85783-f59c-4b73-9433-7fa0380b3c21` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-96c2ab86-d893-4d12-b14d-00ff01123270` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-94a2c767-af55-4f52-981c-071d2d1c3782` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f88d249c-f3a7-42ab-b7d2-6e92d3b9ad1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f88d249c-f3a7-42ab-b7d2-6e92d3b9ad1a
Content-Type: application/json

--- request body ---
{"handle":"qa-4a862f661105","displayName":"QA 4a862f661105","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f88d249c-f3a7-42ab-b7d2-6e92d3b9ad1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-4a862f661105
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f8bddc5-816f-4f44-9921-324b0489b6e0","handle":"qa-4a862f661105","displayName":"QA 4a862f661105","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.375978804Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0042148f-d8d5-4997-99a4-322a4c97d58a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0042148f-d8d5-4997-99a4-322a4c97d58a
Content-Type: application/json

--- request body ---
{"handle":"qa-31a2af231887","displayName":"QA 31a2af231887","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-0042148f-d8d5-4997-99a4-322a4c97d58a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-31a2af231887
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e499c972-9507-4c69-a081-7873a5ff82a7","handle":"qa-31a2af231887","displayName":"QA 31a2af231887","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.418786798Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-379d1acb-3ef2-4016-b529-4fa70ab5de77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-379d1acb-3ef2-4016-b529-4fa70ab5de77
Content-Type: application/json

--- request body ---
{"handle":"qa-68587e5ddcd5","displayName":"QA 68587e5ddcd5","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-379d1acb-3ef2-4016-b529-4fa70ab5de77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-68587e5ddcd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0543e8f9-4eb9-41e9-bb17-a797b53d504a","handle":"qa-68587e5ddcd5","displayName":"QA 68587e5ddcd5","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.465980499Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-062f5fea-852b-4708-b85d-244c0d37d487

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-062f5fea-852b-4708-b85d-244c0d37d487
Content-Type: application/json

--- request body ---
{"handle":"qa-4a862f661105","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-062f5fea-852b-4708-b85d-244c0d37d487
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 531
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f8bddc5-816f-4f44-9921-324b0489b6e0"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-8d102aca-0a85-4382-b4b4-1168253fbe14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d102aca-0a85-4382-b4b4-1168253fbe14
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-31a2af231887","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d102aca-0a85-4382-b4b4-1168253fbe14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_d6d9c8b9-7a7a-440b-846b-60af2a7ff051
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d6d9c8b9-7a7a-440b-846b-60af2a7ff051","subject":"Error contract","status":"open","region":"eu","participants":["qa-4a862f661105","qa-31a2af231887"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.495686860Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-948eef8a-3a9c-4870-81a4-5fc37cef97c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-948eef8a-3a9c-4870-81a4-5fc37cef97c9
Content-Type: application/json

--- request body ---
{"handle":"qa-68587e5ddcd5","password":"****"}

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-948eef8a-3a9c-4870-81a4-5fc37cef97c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0543e8f9-4eb9-41e9-bb17-a797b53d504a"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d6d9c8b9-7a7a-440b-846b-60af2a7ff051/messages
correlation: qa-de16f841-2a80-402f-9f4e-463a49b0119c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de16f841-2a80-402f-9f4e-463a49b0119c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de16f841-2a80-402f-9f4e-463a49b0119c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_d6d9c8b9-7a7a-440b-846b-60af2a7ff051/messages","correlationId":"qa-de16f841-2a80-402f-9f4e-463a49b0119c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d737e6c1-b42c-44f3-8fc5-b689c8fec759

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d737e6c1-b42c-44f3-8fc5-b689c8fec759
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d737e6c1-b42c-44f3-8fc5-b689c8fec759
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-184a9cb6-4628-4860-b6b1-14404439a320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-184a9cb6-4628-4860-b6b1-14404439a320
Content-Type: application/json

--- request body ---
{"handle":"qa-68587e5ddcd5","password":"****"}

--- response: 401 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-184a9cb6-4628-4860-b6b1-14404439a320
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-184a9cb6-4628-4860-b6b1-14404439a320"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-b39c797b-64ed-41ab-9ad6-945b78b1c798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39c797b-64ed-41ab-9ad6-945b78b1c798
Content-Type: application/json

--- request body ---
{"handle":"qa-31a2af231887","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b39c797b-64ed-41ab-9ad6-945b78b1c798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 507
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e499c972-9507-4c69-a081-7873a5ff82a7"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f2b8aca3-1fb7-408c-8c33-7dd76c6989e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2b8aca3-1fb7-408c-8c33-7dd76c6989e4
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f2b8aca3-1fb7-408c-8c33-7dd76c6989e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-96f85783-f59c-4b73-9433-7fa0380b3c21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f85783-f59c-4b73-9433-7fa0380b3c21
Content-Type: application/json

--- request body ---
{"handle":"qa-31a2af231887","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96f85783-f59c-4b73-9433-7fa0380b3c21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96f85783-f59c-4b73-9433-7fa0380b3c21"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96c2ab86-d893-4d12-b14d-00ff01123270

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96c2ab86-d893-4d12-b14d-00ff01123270
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96c2ab86-d893-4d12-b14d-00ff01123270
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-94a2c767-af55-4f52-981c-071d2d1c3782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a2c767-af55-4f52-981c-071d2d1c3782
Content-Type: application/json

--- request body ---
{"handle":"qa-4a862f661105","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94a2c767-af55-4f52-981c-071d2d1c3782
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94a2c767-af55-4f52-981c-071d2d1c3782"}
```
