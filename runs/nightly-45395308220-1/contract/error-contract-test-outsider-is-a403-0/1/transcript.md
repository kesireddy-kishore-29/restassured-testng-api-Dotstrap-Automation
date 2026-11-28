# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-c485ef95-6a89-4514-99d0-f8f0902903fc` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-1cf6375b-3d60-474d-ae80-f342b99ce7b4` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-d1e139e4-ad2f-4876-8d9b-2bb7ab13e343` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-dc2a1b36-f743-4f13-8773-faf187d5a877` |
| 5 | `POST /v1/conversations` | 201 | 14 | `qa-d581da27-2e03-4b77-82fa-22e4d9ed4dd6` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-fa6b51b7-fe7a-4926-bc40-05f6e9279c89` |
| 7 | `GET /v1/conversations/{id}` | 403 | 11 | `qa-7cb75218-1a3d-4b6b-aba7-528426a72db1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-355e041f-3ea2-49d2-b1c9-3b01009baf2f` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-33336649-be55-4927-ac85-f42352622986` |
| 10 | `POST /v1/auth/token` | 200 | 51 | `qa-090c78e3-a0bc-4ab0-b727-6444d2634943` |
| 11 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-f196de06-1f51-46d0-bc4e-45e0b18537f3` |
| 12 | `POST /v1/auth/token` | 401 | 17 | `qa-cd5a0816-c15b-44dc-9ec1-2a8221440d68` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-16fc1084-6843-489d-9ef2-e8e5bd809d89` |
| 14 | `POST /v1/auth/token` | 401 | 35 | `qa-c697bb43-0796-4920-a780-c2157a3b7e0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c485ef95-6a89-4514-99d0-f8f0902903fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c485ef95-6a89-4514-99d0-f8f0902903fc
Content-Type: application/json

--- request body ---
{"handle":"qa-ff540ddb7fa5","displayName":"QA ff540ddb7fa5","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-c485ef95-6a89-4514-99d0-f8f0902903fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Location: /v1/accounts/qa-ff540ddb7fa5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c28e49d6-55c3-4ba2-8024-06b69b460289","handle":"qa-ff540ddb7fa5","displayName":"QA ff540ddb7fa5","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.378259471Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1cf6375b-3d60-474d-ae80-f342b99ce7b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf6375b-3d60-474d-ae80-f342b99ce7b4
Content-Type: application/json

--- request body ---
{"handle":"qa-e4534902eaea","displayName":"QA e4534902eaea","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf6375b-3d60-474d-ae80-f342b99ce7b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-e4534902eaea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6d1a487-06d7-43ea-80e5-682762b2a36f","handle":"qa-e4534902eaea","displayName":"QA e4534902eaea","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.421861142Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d1e139e4-ad2f-4876-8d9b-2bb7ab13e343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1e139e4-ad2f-4876-8d9b-2bb7ab13e343
Content-Type: application/json

--- request body ---
{"handle":"qa-2907fc796da4","displayName":"QA 2907fc796da4","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1e139e4-ad2f-4876-8d9b-2bb7ab13e343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-2907fc796da4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80359479-6935-48c7-932d-2ec6d89d6bf2","handle":"qa-2907fc796da4","displayName":"QA 2907fc796da4","region":"eu","role":"user","createdAt":"2026-11-24T12:38:13.459315688Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dc2a1b36-f743-4f13-8773-faf187d5a877

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc2a1b36-f743-4f13-8773-faf187d5a877
Content-Type: application/json

--- request body ---
{"handle":"qa-ff540ddb7fa5","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc2a1b36-f743-4f13-8773-faf187d5a877
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c28e49d6-55c3-4ba2-8024-06b69b460289"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d581da27-2e03-4b77-82fa-22e4d9ed4dd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d581da27-2e03-4b77-82fa-22e4d9ed4dd6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4534902eaea","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-d581da27-2e03-4b77-82fa-22e4d9ed4dd6
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
Location: /v1/conversations/cnv_b6a08dd1-08b0-413b-83ce-99fc8e010bca
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b6a08dd1-08b0-413b-83ce-99fc8e010bca","subject":"Error contract","status":"open","region":"eu","participants":["qa-ff540ddb7fa5","qa-e4534902eaea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:13.532842199Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fa6b51b7-fe7a-4926-bc40-05f6e9279c89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa6b51b7-fe7a-4926-bc40-05f6e9279c89
Content-Type: application/json

--- request body ---
{"handle":"qa-2907fc796da4","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa6b51b7-fe7a-4926-bc40-05f6e9279c89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80359479-6935-48c7-932d-2ec6d89d6bf2"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b6a08dd1-08b0-413b-83ce-99fc8e010bca
correlation: qa-7cb75218-1a3d-4b6b-aba7-528426a72db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cb75218-1a3d-4b6b-aba7-528426a72db1
Content-Type: application/json

--- response: 403 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cb75218-1a3d-4b6b-aba7-528426a72db1
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b6a08dd1-08b0-413b-83ce-99fc8e010bca","correlationId":"qa-7cb75218-1a3d-4b6b-aba7-528426a72db1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-355e041f-3ea2-49d2-b1c9-3b01009baf2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-355e041f-3ea2-49d2-b1c9-3b01009baf2f
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-355e041f-3ea2-49d2-b1c9-3b01009baf2f
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
correlation: qa-33336649-be55-4927-ac85-f42352622986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33336649-be55-4927-ac85-f42352622986
Content-Type: application/json

--- request body ---
{"handle":"qa-2907fc796da4","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33336649-be55-4927-ac85-f42352622986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33336649-be55-4927-ac85-f42352622986"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-090c78e3-a0bc-4ab0-b727-6444d2634943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090c78e3-a0bc-4ab0-b727-6444d2634943
Content-Type: application/json

--- request body ---
{"handle":"qa-e4534902eaea","password":"****"}

--- response: 200 in 51 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-090c78e3-a0bc-4ab0-b727-6444d2634943
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6d1a487-06d7-43ea-80e5-682762b2a36f"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f196de06-1f51-46d0-bc4e-45e0b18537f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f196de06-1f51-46d0-bc4e-45e0b18537f3
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f196de06-1f51-46d0-bc4e-45e0b18537f3
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
correlation: qa-cd5a0816-c15b-44dc-9ec1-2a8221440d68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5a0816-c15b-44dc-9ec1-2a8221440d68
Content-Type: application/json

--- request body ---
{"handle":"qa-e4534902eaea","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd5a0816-c15b-44dc-9ec1-2a8221440d68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd5a0816-c15b-44dc-9ec1-2a8221440d68"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16fc1084-6843-489d-9ef2-e8e5bd809d89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16fc1084-6843-489d-9ef2-e8e5bd809d89
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16fc1084-6843-489d-9ef2-e8e5bd809d89
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c697bb43-0796-4920-a780-c2157a3b7e0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c697bb43-0796-4920-a780-c2157a3b7e0c
Content-Type: application/json

--- request body ---
{"handle":"qa-ff540ddb7fa5","password":"****"}

--- response: 401 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c697bb43-0796-4920-a780-c2157a3b7e0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c697bb43-0796-4920-a780-c2157a3b7e0c"}
```
