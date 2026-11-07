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
| 1 | `POST /v1/accounts` | 201 | 409 | `qa-7ad75c7b-f1b0-407c-afb4-29d35a3fedb5` |
| 2 | `POST /v1/accounts` | 201 | 61 | `qa-98386464-9d1b-433c-b6cc-9ecf1b811c26` |
| 3 | `POST /v1/accounts` | 201 | 55 | `qa-539fc99a-e7f8-481e-967c-7bf95feb98da` |
| 4 | `POST /v1/auth/token` | 200 | 49 | `qa-acc8001e-a94d-4ff4-9ff2-cf902e17dcbc` |
| 5 | `POST /v1/conversations` | 201 | 47 | `qa-f74ebdfd-4321-45d0-b3d5-3c4a9ea9625a` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-95177ddc-4c7b-448e-af3f-08219abceffd` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 34 | `qa-376ea7a2-c847-4c9f-9497-696bc53eb352` |
| 8 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-cca49ef6-fa9c-49a0-8d7b-561d14ad4827` |
| 9 | `POST /v1/auth/token` | 401 | 36 | `qa-90d3f6ca-064d-4eb5-ab02-eee131ce5ae9` |
| 10 | `POST /v1/auth/token` | 200 | 35 | `qa-e17f4b0a-7556-416c-8f36-bad68c394679` |
| 11 | `DELETE /v1/accounts/me` | 204 | 54 | `qa-cb026d35-83db-4487-b48e-2ec828eba227` |
| 12 | `POST /v1/auth/token` | 401 | 65 | `qa-5886843b-237b-4c3d-ab09-49fe112e86cd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-8b65a221-db36-4e68-a191-b521d570c3d9` |
| 14 | `POST /v1/auth/token` | 401 | 28 | `qa-cf22e005-21ba-40f1-bb1d-7017c8bbc3a6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7ad75c7b-f1b0-407c-afb4-29d35a3fedb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ad75c7b-f1b0-407c-afb4-29d35a3fedb5
Content-Type: application/json

--- request body ---
{"handle":"qa-4735dfc0848c","displayName":"QA 4735dfc0848c","password":"****","region":"eu"}

--- response: 201 in 409 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ad75c7b-f1b0-407c-afb4-29d35a3fedb5
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
Location: /v1/accounts/qa-4735dfc0848c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90690d4f-5a2f-4db4-9026-2ca28b96ea9a","handle":"qa-4735dfc0848c","displayName":"QA 4735dfc0848c","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.338287315Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-98386464-9d1b-433c-b6cc-9ecf1b811c26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98386464-9d1b-433c-b6cc-9ecf1b811c26
Content-Type: application/json

--- request body ---
{"handle":"qa-1ffedca778cd","displayName":"QA 1ffedca778cd","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-98386464-9d1b-433c-b6cc-9ecf1b811c26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-1ffedca778cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_279ccfc5-074f-4d47-9016-4afcaf214b69","handle":"qa-1ffedca778cd","displayName":"QA 1ffedca778cd","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.802264837Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-539fc99a-e7f8-481e-967c-7bf95feb98da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539fc99a-e7f8-481e-967c-7bf95feb98da
Content-Type: application/json

--- request body ---
{"handle":"qa-21dd951ee731","displayName":"QA 21dd951ee731","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-539fc99a-e7f8-481e-967c-7bf95feb98da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-21dd951ee731
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dda3498-3253-4d65-b039-78c50948809d","handle":"qa-21dd951ee731","displayName":"QA 21dd951ee731","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.885913243Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-acc8001e-a94d-4ff4-9ff2-cf902e17dcbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acc8001e-a94d-4ff4-9ff2-cf902e17dcbc
Content-Type: application/json

--- request body ---
{"handle":"qa-4735dfc0848c","password":"****"}

--- response: 200 in 49 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-acc8001e-a94d-4ff4-9ff2-cf902e17dcbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90690d4f-5a2f-4db4-9026-2ca28b96ea9a"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f74ebdfd-4321-45d0-b3d5-3c4a9ea9625a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74ebdfd-4321-45d0-b3d5-3c4a9ea9625a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1ffedca778cd","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74ebdfd-4321-45d0-b3d5-3c4a9ea9625a
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
Location: /v1/conversations/cnv_91ad4761-a185-4fa0-8a5f-81aa27d278ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_91ad4761-a185-4fa0-8a5f-81aa27d278ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-4735dfc0848c","qa-1ffedca778cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:21.053989904Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-95177ddc-4c7b-448e-af3f-08219abceffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95177ddc-4c7b-448e-af3f-08219abceffd
Content-Type: application/json

--- request body ---
{"handle":"qa-21dd951ee731","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-95177ddc-4c7b-448e-af3f-08219abceffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dda3498-3253-4d65-b039-78c50948809d"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_91ad4761-a185-4fa0-8a5f-81aa27d278ea/messages
correlation: qa-376ea7a2-c847-4c9f-9497-696bc53eb352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-376ea7a2-c847-4c9f-9497-696bc53eb352
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-376ea7a2-c847-4c9f-9497-696bc53eb352
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_91ad4761-a185-4fa0-8a5f-81aa27d278ea/messages","correlationId":"qa-376ea7a2-c847-4c9f-9497-696bc53eb352"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cca49ef6-fa9c-49a0-8d7b-561d14ad4827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca49ef6-fa9c-49a0-8d7b-561d14ad4827
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cca49ef6-fa9c-49a0-8d7b-561d14ad4827
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
correlation: qa-90d3f6ca-064d-4eb5-ab02-eee131ce5ae9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d3f6ca-064d-4eb5-ab02-eee131ce5ae9
Content-Type: application/json

--- request body ---
{"handle":"qa-21dd951ee731","password":"****"}

--- response: 401 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90d3f6ca-064d-4eb5-ab02-eee131ce5ae9
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-90d3f6ca-064d-4eb5-ab02-eee131ce5ae9"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e17f4b0a-7556-416c-8f36-bad68c394679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17f4b0a-7556-416c-8f36-bad68c394679
Content-Type: application/json

--- request body ---
{"handle":"qa-1ffedca778cd","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-e17f4b0a-7556-416c-8f36-bad68c394679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_279ccfc5-074f-4d47-9016-4afcaf214b69"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cb026d35-83db-4487-b48e-2ec828eba227

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb026d35-83db-4487-b48e-2ec828eba227
Content-Type: application/json

--- response: 204 in 54 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cb026d35-83db-4487-b48e-2ec828eba227
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
correlation: qa-5886843b-237b-4c3d-ab09-49fe112e86cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5886843b-237b-4c3d-ab09-49fe112e86cd
Content-Type: application/json

--- request body ---
{"handle":"qa-1ffedca778cd","password":"****"}

--- response: 401 in 65 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5886843b-237b-4c3d-ab09-49fe112e86cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5886843b-237b-4c3d-ab09-49fe112e86cd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b65a221-db36-4e68-a191-b521d570c3d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b65a221-db36-4e68-a191-b521d570c3d9
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b65a221-db36-4e68-a191-b521d570c3d9
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
correlation: qa-cf22e005-21ba-40f1-bb1d-7017c8bbc3a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf22e005-21ba-40f1-bb1d-7017c8bbc3a6
Content-Type: application/json

--- request body ---
{"handle":"qa-4735dfc0848c","password":"****"}

--- response: 401 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf22e005-21ba-40f1-bb1d-7017c8bbc3a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf22e005-21ba-40f1-bb1d-7017c8bbc3a6"}
```
