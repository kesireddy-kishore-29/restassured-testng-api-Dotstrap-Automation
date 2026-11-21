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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-a64ddd27-2b8a-4bd0-96ef-adb4aede1fbc` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-086cedf8-5c89-4c95-b817-2dad1045958d` |
| 3 | `POST /v1/accounts` | 201 | 18 | `qa-87d646e8-f282-4ec3-a4f1-2f026f51a3ab` |
| 4 | `POST /v1/auth/token` | 200 | 21 | `qa-5fc66549-e8f2-44e1-ad95-75dfd8488210` |
| 5 | `POST /v1/conversations` | 201 | 19 | `qa-cb679bbe-22c5-428e-8bc4-bcc407a457c1` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-587df763-ab04-4d8b-b4a1-f62e23b9adf5` |
| 7 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-c69a7839-c8f9-4f05-a05e-3deb6114c094` |
| 8 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-0fde81ca-96bd-4dc2-b779-6a586b65354a` |
| 9 | `POST /v1/auth/token` | 401 | 24 | `qa-08f001a7-e994-47e9-8079-07d0af11df60` |
| 10 | `POST /v1/auth/token` | 200 | 53 | `qa-afe67651-f37f-4864-a520-ef2be6e759e8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 60 | `qa-55c4fe08-04ff-4132-b4c3-a28cea9d6657` |
| 12 | `POST /v1/auth/token` | 401 | 41 | `qa-1ea1ab5a-4154-4260-b3b6-a2d954b27a6e` |
| 13 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-3d4e9e94-4624-45a6-875b-235ac66e9e3d` |
| 14 | `POST /v1/auth/token` | 401 | 39 | `qa-c8419101-51b5-4ed9-b222-7a256551b563` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a64ddd27-2b8a-4bd0-96ef-adb4aede1fbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64ddd27-2b8a-4bd0-96ef-adb4aede1fbc
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d6d6cbf4f","displayName":"QA 9d2d6d6cbf4f","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a64ddd27-2b8a-4bd0-96ef-adb4aede1fbc
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
Location: /v1/accounts/qa-9d2d6d6cbf4f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d7fea42-a6bb-49ea-bfe7-75bd8313962d","handle":"qa-9d2d6d6cbf4f","displayName":"QA 9d2d6d6cbf4f","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.722440447Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-086cedf8-5c89-4c95-b817-2dad1045958d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-086cedf8-5c89-4c95-b817-2dad1045958d
Content-Type: application/json

--- request body ---
{"handle":"qa-01c90da88bd8","displayName":"QA 01c90da88bd8","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-086cedf8-5c89-4c95-b817-2dad1045958d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-01c90da88bd8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7de1d9ae-0959-41e5-a050-2e69879b7086","handle":"qa-01c90da88bd8","displayName":"QA 01c90da88bd8","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.762837086Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-87d646e8-f282-4ec3-a4f1-2f026f51a3ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87d646e8-f282-4ec3-a4f1-2f026f51a3ab
Content-Type: application/json

--- request body ---
{"handle":"qa-e262cdbe365c","displayName":"QA e262cdbe365c","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-87d646e8-f282-4ec3-a4f1-2f026f51a3ab
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
Location: /v1/accounts/qa-e262cdbe365c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_523d17dd-fdaa-4905-a5eb-de61bc275750","handle":"qa-e262cdbe365c","displayName":"QA e262cdbe365c","region":"eu","role":"user","createdAt":"2026-11-20T10:10:00.791532832Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5fc66549-e8f2-44e1-ad95-75dfd8488210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fc66549-e8f2-44e1-ad95-75dfd8488210
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d6d6cbf4f","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fc66549-e8f2-44e1-ad95-75dfd8488210
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d7fea42-a6bb-49ea-bfe7-75bd8313962d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-cb679bbe-22c5-428e-8bc4-bcc407a457c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb679bbe-22c5-428e-8bc4-bcc407a457c1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01c90da88bd8","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb679bbe-22c5-428e-8bc4-bcc407a457c1
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
Location: /v1/conversations/cnv_b776359b-ccf3-4a35-854d-fc7c06e7c789
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b776359b-ccf3-4a35-854d-fc7c06e7c789","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d2d6d6cbf4f","qa-01c90da88bd8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:00.853565614Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-587df763-ab04-4d8b-b4a1-f62e23b9adf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-587df763-ab04-4d8b-b4a1-f62e23b9adf5
Content-Type: application/json

--- request body ---
{"handle":"qa-e262cdbe365c","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-587df763-ab04-4d8b-b4a1-f62e23b9adf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_523d17dd-fdaa-4905-a5eb-de61bc275750"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b776359b-ccf3-4a35-854d-fc7c06e7c789
correlation: qa-c69a7839-c8f9-4f05-a05e-3deb6114c094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c69a7839-c8f9-4f05-a05e-3deb6114c094
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c69a7839-c8f9-4f05-a05e-3deb6114c094
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b776359b-ccf3-4a35-854d-fc7c06e7c789","correlationId":"qa-c69a7839-c8f9-4f05-a05e-3deb6114c094"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fde81ca-96bd-4dc2-b779-6a586b65354a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fde81ca-96bd-4dc2-b779-6a586b65354a
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fde81ca-96bd-4dc2-b779-6a586b65354a
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
correlation: qa-08f001a7-e994-47e9-8079-07d0af11df60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08f001a7-e994-47e9-8079-07d0af11df60
Content-Type: application/json

--- request body ---
{"handle":"qa-e262cdbe365c","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08f001a7-e994-47e9-8079-07d0af11df60
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08f001a7-e994-47e9-8079-07d0af11df60"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-afe67651-f37f-4864-a520-ef2be6e759e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afe67651-f37f-4864-a520-ef2be6e759e8
Content-Type: application/json

--- request body ---
{"handle":"qa-01c90da88bd8","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-afe67651-f37f-4864-a520-ef2be6e759e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7de1d9ae-0959-41e5-a050-2e69879b7086"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55c4fe08-04ff-4132-b4c3-a28cea9d6657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55c4fe08-04ff-4132-b4c3-a28cea9d6657
Content-Type: application/json

--- response: 204 in 60 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55c4fe08-04ff-4132-b4c3-a28cea9d6657
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
correlation: qa-1ea1ab5a-4154-4260-b3b6-a2d954b27a6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea1ab5a-4154-4260-b3b6-a2d954b27a6e
Content-Type: application/json

--- request body ---
{"handle":"qa-01c90da88bd8","password":"****"}

--- response: 401 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ea1ab5a-4154-4260-b3b6-a2d954b27a6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ea1ab5a-4154-4260-b3b6-a2d954b27a6e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d4e9e94-4624-45a6-875b-235ac66e9e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d4e9e94-4624-45a6-875b-235ac66e9e3d
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d4e9e94-4624-45a6-875b-235ac66e9e3d
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
correlation: qa-c8419101-51b5-4ed9-b222-7a256551b563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8419101-51b5-4ed9-b222-7a256551b563
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2d6d6cbf4f","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8419101-51b5-4ed9-b222-7a256551b563
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8419101-51b5-4ed9-b222-7a256551b563"}
```
