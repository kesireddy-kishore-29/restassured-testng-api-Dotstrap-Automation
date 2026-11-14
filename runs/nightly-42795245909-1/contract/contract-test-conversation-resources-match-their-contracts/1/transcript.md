# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-ed9f5fb3-6454-41f4-bc16-b0342053621a` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-8c5bc1b2-8a7c-4de9-981b-577b9332e141` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-ba02f98f-8722-4d72-9fc4-d10c86d83f58` |
| 4 | `POST /v1/conversations` | 201 | 62 | `qa-5d042ceb-4c76-4e1e-b840-9d1419c66cc7` |
| 5 | `GET /v1/conversations` | 200 | 22 | `qa-354f6847-e6f8-494c-88c1-fff2e47ba059` |
| 6 | `GET /v1/conversations/{id}` | 200 | 7 | `qa-46379804-00b5-42cd-8c3a-5f1cb5593e8c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-d94d044d-14c7-468e-a9c9-98850414b381` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-ab36df41-58a7-4dd8-9688-aeb5716a6a59` |
| 9 | `POST /v1/auth/token` | 200 | 12 | `qa-6f5cb2a5-6187-4ac4-a4b3-de1802806b78` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 12 | `qa-7c3ed91e-369c-41f3-8a99-a7fbfff22e05` |
| 11 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-33bbfa8c-8017-479c-8c56-7b0f4d44d3a6` |
| 12 | `POST /v1/auth/token` | 401 | 6 | `qa-10d86f60-e275-438a-b567-49472d878bac` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-7d32694e-9a8f-42ed-81e7-469b7a5fb155` |
| 14 | `POST /v1/auth/token` | 401 | 7 | `qa-bd583df0-bd81-4595-b5c1-d25e38c44d09` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ed9f5fb3-6454-41f4-bc16-b0342053621a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed9f5fb3-6454-41f4-bc16-b0342053621a
Content-Type: application/json

--- request body ---
{"handle":"qa-aeeef5a07e4b","displayName":"QA aeeef5a07e4b","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed9f5fb3-6454-41f4-bc16-b0342053621a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-aeeef5a07e4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61f537c1-46a0-475a-bf3d-5639fc022384","handle":"qa-aeeef5a07e4b","displayName":"QA aeeef5a07e4b","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.234008590Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8c5bc1b2-8a7c-4de9-981b-577b9332e141

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5bc1b2-8a7c-4de9-981b-577b9332e141
Content-Type: application/json

--- request body ---
{"handle":"qa-5087907b018d","displayName":"QA 5087907b018d","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c5bc1b2-8a7c-4de9-981b-577b9332e141
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-5087907b018d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b172243-fc8b-4277-baad-113a59c2cf9d","handle":"qa-5087907b018d","displayName":"QA 5087907b018d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:34.578189192Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba02f98f-8722-4d72-9fc4-d10c86d83f58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba02f98f-8722-4d72-9fc4-d10c86d83f58
Content-Type: application/json

--- request body ---
{"handle":"qa-aeeef5a07e4b","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba02f98f-8722-4d72-9fc4-d10c86d83f58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61f537c1-46a0-475a-bf3d-5639fc022384"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5d042ceb-4c76-4e1e-b840-9d1419c66cc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d042ceb-4c76-4e1e-b840-9d1419c66cc7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5087907b018d","subject":"Contract check","message":"Hello"}

--- response: 201 in 62 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d042ceb-4c76-4e1e-b840-9d1419c66cc7
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
Location: /v1/conversations/cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","subject":"Contract check","status":"open","region":"eu","participants":["qa-aeeef5a07e4b","qa-5087907b018d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.741368926Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-354f6847-e6f8-494c-88c1-fff2e47ba059

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-354f6847-e6f8-494c-88c1-fff2e47ba059
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-354f6847-e6f8-494c-88c1-fff2e47ba059
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
Content-Length: 259

{"items":[{"id":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","subject":"Contract check","status":"open","region":"eu","participants":["qa-aeeef5a07e4b","qa-5087907b018d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.741368926Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c
correlation: qa-46379804-00b5-42cd-8c3a-5f1cb5593e8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46379804-00b5-42cd-8c3a-5f1cb5593e8c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-46379804-00b5-42cd-8c3a-5f1cb5593e8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","subject":"Contract check","status":"open","region":"eu","participants":["qa-aeeef5a07e4b","qa-5087907b018d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:34.741368926Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c/messages
correlation: qa-d94d044d-14c7-468e-a9c9-98850414b381

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d94d044d-14c7-468e-a9c9-98850414b381
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-d94d044d-14c7-468e-a9c9-98850414b381
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 197

{"id":"msg_3cd24bea-b35b-4cda-a78e-612a8ced389a","conversationId":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","sender":"qa-aeeef5a07e4b","body":"Second","createdAt":"2026-11-10T09:59:34.891387532Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c/messages
correlation: qa-ab36df41-58a7-4dd8-9688-aeb5716a6a59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab36df41-58a7-4dd8-9688-aeb5716a6a59
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab36df41-58a7-4dd8-9688-aeb5716a6a59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_909ec8a3-0156-44cd-81fa-fc72288bb5ea","conversationId":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","sender":"qa-aeeef5a07e4b","body":"Hello","createdAt":"2026-11-10T09:59:34.741556844Z"},{"id":"msg_3cd24bea-b35b-4cda-a78e-612a8ced389a","conversationId":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","sender":"qa-aeeef5a07e4b","body":"Second","createdAt":"2026-11-10T09:59:34.891387532Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6f5cb2a5-6187-4ac4-a4b3-de1802806b78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f5cb2a5-6187-4ac4-a4b3-de1802806b78
Content-Type: application/json

--- request body ---
{"handle":"qa-5087907b018d","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f5cb2a5-6187-4ac4-a4b3-de1802806b78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b172243-fc8b-4277-baad-113a59c2cf9d"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c/read
correlation: qa-7c3ed91e-369c-41f3-8a99-a7fbfff22e05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c3ed91e-369c-41f3-8a99-a7fbfff22e05
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c3ed91e-369c-41f3-8a99-a7fbfff22e05
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
Content-Length: 77

{"conversationId":"cnv_b8dfbbc8-ed73-405a-ba1d-84889d36e28c","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33bbfa8c-8017-479c-8c56-7b0f4d44d3a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33bbfa8c-8017-479c-8c56-7b0f4d44d3a6
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33bbfa8c-8017-479c-8c56-7b0f4d44d3a6
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-10d86f60-e275-438a-b567-49472d878bac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10d86f60-e275-438a-b567-49472d878bac
Content-Type: application/json

--- request body ---
{"handle":"qa-5087907b018d","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10d86f60-e275-438a-b567-49472d878bac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10d86f60-e275-438a-b567-49472d878bac"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7d32694e-9a8f-42ed-81e7-469b7a5fb155

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d32694e-9a8f-42ed-81e7-469b7a5fb155
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7d32694e-9a8f-42ed-81e7-469b7a5fb155
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bd583df0-bd81-4595-b5c1-d25e38c44d09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd583df0-bd81-4595-b5c1-d25e38c44d09
Content-Type: application/json

--- request body ---
{"handle":"qa-aeeef5a07e4b","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd583df0-bd81-4595-b5c1-d25e38c44d09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd583df0-bd81-4595-b5c1-d25e38c44d09"}
```
