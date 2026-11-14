# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f2f19a2b-4a4a-4229-9551-aba0bea7185f` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-5f26d1d1-02d5-42eb-9fb9-621077503764` |
| 3 | `POST /v1/accounts` | 201 | 43 | `qa-3d7702ac-4c7e-4c67-86a7-d463b8be3c53` |
| 4 | `POST /v1/auth/token` | 200 | 42 | `qa-dcdd52bd-940d-45f6-bc2a-a2bbba52336b` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-58264a59-9412-4c12-8b0d-9887ab4b70a5` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-432482ea-c82a-474f-a2b2-589bf3fca16d` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 23 | `qa-8b199897-a17a-4480-b079-7749b1b550a0` |
| 8 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-a08142d8-0251-437c-8a41-fadc552a4848` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-f2c1dd58-f892-4b35-9daf-31d024e2f785` |
| 10 | `POST /v1/auth/token` | 200 | 38 | `qa-08e24943-1c8e-4189-b4ca-966b12def586` |
| 11 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-29c4c411-02a2-43a8-9ced-ef9562b807fd` |
| 12 | `POST /v1/auth/token` | 401 | 28 | `qa-cb999056-40fe-4a24-8735-a292b80697cc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-794abf2e-e623-46ca-bb30-1d3799add3ab` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-f6d97d93-9651-472e-8cff-cac997c70e98` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f2f19a2b-4a4a-4229-9551-aba0bea7185f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2f19a2b-4a4a-4229-9551-aba0bea7185f
Content-Type: application/json

--- request body ---
{"handle":"qa-615b811f6d25","displayName":"QA 615b811f6d25","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2f19a2b-4a4a-4229-9551-aba0bea7185f
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
Location: /v1/accounts/qa-615b811f6d25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_221f0054-362f-4aad-a2fb-5cb34d52d094","handle":"qa-615b811f6d25","displayName":"QA 615b811f6d25","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.515964434Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5f26d1d1-02d5-42eb-9fb9-621077503764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f26d1d1-02d5-42eb-9fb9-621077503764
Content-Type: application/json

--- request body ---
{"handle":"qa-2acd9fb5bef1","displayName":"QA 2acd9fb5bef1","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f26d1d1-02d5-42eb-9fb9-621077503764
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 7
Location: /v1/accounts/qa-2acd9fb5bef1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8619d90b-8712-41a9-91a3-a88f4d2c983c","handle":"qa-2acd9fb5bef1","displayName":"QA 2acd9fb5bef1","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.575512359Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-3d7702ac-4c7e-4c67-86a7-d463b8be3c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d7702ac-4c7e-4c67-86a7-d463b8be3c53
Content-Type: application/json

--- request body ---
{"handle":"qa-3c1a7a360310","displayName":"QA 3c1a7a360310","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d7702ac-4c7e-4c67-86a7-d463b8be3c53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Location: /v1/accounts/qa-3c1a7a360310
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8c658a5f-c67b-48c7-802a-447a7312694f","handle":"qa-3c1a7a360310","displayName":"QA 3c1a7a360310","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.634963307Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-dcdd52bd-940d-45f6-bc2a-a2bbba52336b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcdd52bd-940d-45f6-bc2a-a2bbba52336b
Content-Type: application/json

--- request body ---
{"handle":"qa-615b811f6d25","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcdd52bd-940d-45f6-bc2a-a2bbba52336b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_221f0054-362f-4aad-a2fb-5cb34d52d094"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-58264a59-9412-4c12-8b0d-9887ab4b70a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58264a59-9412-4c12-8b0d-9887ab4b70a5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2acd9fb5bef1","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-58264a59-9412-4c12-8b0d-9887ab4b70a5
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
Location: /v1/conversations/cnv_e9b0a1a9-8782-44aa-9e52-9d75da8c9dd2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e9b0a1a9-8782-44aa-9e52-9d75da8c9dd2","subject":"Error contract","status":"open","region":"eu","participants":["qa-615b811f6d25","qa-2acd9fb5bef1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:55.732056952Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-432482ea-c82a-474f-a2b2-589bf3fca16d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-432482ea-c82a-474f-a2b2-589bf3fca16d
Content-Type: application/json

--- request body ---
{"handle":"qa-3c1a7a360310","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-432482ea-c82a-474f-a2b2-589bf3fca16d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8c658a5f-c67b-48c7-802a-447a7312694f"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e9b0a1a9-8782-44aa-9e52-9d75da8c9dd2/close
correlation: qa-8b199897-a17a-4480-b079-7749b1b550a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b199897-a17a-4480-b079-7749b1b550a0
Content-Type: application/json

--- response: 403 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b199897-a17a-4480-b079-7749b1b550a0
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_e9b0a1a9-8782-44aa-9e52-9d75da8c9dd2/close","correlationId":"qa-8b199897-a17a-4480-b079-7749b1b550a0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a08142d8-0251-437c-8a41-fadc552a4848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a08142d8-0251-437c-8a41-fadc552a4848
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a08142d8-0251-437c-8a41-fadc552a4848
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
correlation: qa-f2c1dd58-f892-4b35-9daf-31d024e2f785

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2c1dd58-f892-4b35-9daf-31d024e2f785
Content-Type: application/json

--- request body ---
{"handle":"qa-3c1a7a360310","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2c1dd58-f892-4b35-9daf-31d024e2f785
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2c1dd58-f892-4b35-9daf-31d024e2f785"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-08e24943-1c8e-4189-b4ca-966b12def586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08e24943-1c8e-4189-b4ca-966b12def586
Content-Type: application/json

--- request body ---
{"handle":"qa-2acd9fb5bef1","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-08e24943-1c8e-4189-b4ca-966b12def586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8619d90b-8712-41a9-91a3-a88f4d2c983c"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29c4c411-02a2-43a8-9ced-ef9562b807fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c4c411-02a2-43a8-9ced-ef9562b807fd
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29c4c411-02a2-43a8-9ced-ef9562b807fd
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
correlation: qa-cb999056-40fe-4a24-8735-a292b80697cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb999056-40fe-4a24-8735-a292b80697cc
Content-Type: application/json

--- request body ---
{"handle":"qa-2acd9fb5bef1","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb999056-40fe-4a24-8735-a292b80697cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cb999056-40fe-4a24-8735-a292b80697cc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-794abf2e-e623-46ca-bb30-1d3799add3ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-794abf2e-e623-46ca-bb30-1d3799add3ab
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-794abf2e-e623-46ca-bb30-1d3799add3ab
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
correlation: qa-f6d97d93-9651-472e-8cff-cac997c70e98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6d97d93-9651-472e-8cff-cac997c70e98
Content-Type: application/json

--- request body ---
{"handle":"qa-615b811f6d25","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6d97d93-9651-472e-8cff-cac997c70e98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f6d97d93-9651-472e-8cff-cac997c70e98"}
```
