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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-e20b9a24-084b-4470-9238-8c61a9f0d698` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-71240c2a-76cc-47bb-a5fa-ed573bcf3ac3` |
| 3 | `POST /v1/accounts` | 201 | 13 | `qa-19382085-f10c-4fcd-8aec-02a03264eace` |
| 4 | `POST /v1/auth/token` | 200 | 12 | `qa-ed64a73e-6e12-4eee-8dbf-03082c90dba0` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-9c6ce2eb-71e9-4241-9cc5-42fb44dee08c` |
| 6 | `POST /v1/auth/token` | 200 | 8 | `qa-6d2d8446-716b-4fdc-813b-0bfd22275948` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 12 | `qa-223548f5-3b30-4958-aedb-820d6dbddd6e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-9154fb1e-d87b-4505-9634-2284f07c7867` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-ecb9d9d0-8537-4c3a-9dba-9ce4f577451d` |
| 10 | `POST /v1/auth/token` | 200 | 55 | `qa-5e4dbcc4-8757-4f7d-a95a-db9103a35386` |
| 11 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-615f6018-9abd-40c1-ac10-cef381285428` |
| 12 | `POST /v1/auth/token` | 401 | 18 | `qa-951c2a0e-78e0-48d9-9076-80eea06061b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9d48c83b-91f1-4c00-8e45-c2b7e5a75c1b` |
| 14 | `POST /v1/auth/token` | 401 | 20 | `qa-72034313-8f44-4eaf-8d28-9814f050ab25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e20b9a24-084b-4470-9238-8c61a9f0d698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e20b9a24-084b-4470-9238-8c61a9f0d698
Content-Type: application/json

--- request body ---
{"handle":"qa-ebe9820f9608","displayName":"QA ebe9820f9608","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e20b9a24-084b-4470-9238-8c61a9f0d698
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-ebe9820f9608
X-Served-Region: eu
Content-Length: 181

{"id":"acc_660a50d1-b01c-4376-affc-57a4de518e13","handle":"qa-ebe9820f9608","displayName":"QA ebe9820f9608","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.870446936Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-71240c2a-76cc-47bb-a5fa-ed573bcf3ac3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71240c2a-76cc-47bb-a5fa-ed573bcf3ac3
Content-Type: application/json

--- request body ---
{"handle":"qa-dc1c8e90bde0","displayName":"QA dc1c8e90bde0","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-71240c2a-76cc-47bb-a5fa-ed573bcf3ac3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-dc1c8e90bde0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b7e7b7c-2aa9-47c4-8ae6-d84ce181b26b","handle":"qa-dc1c8e90bde0","displayName":"QA dc1c8e90bde0","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.892667407Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-19382085-f10c-4fcd-8aec-02a03264eace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19382085-f10c-4fcd-8aec-02a03264eace
Content-Type: application/json

--- request body ---
{"handle":"qa-f44b0e5fd295","displayName":"QA f44b0e5fd295","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-19382085-f10c-4fcd-8aec-02a03264eace
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
Location: /v1/accounts/qa-f44b0e5fd295
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51ec8d49-1b3d-49de-a1d9-5f163a490914","handle":"qa-f44b0e5fd295","displayName":"QA f44b0e5fd295","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.916207450Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ed64a73e-6e12-4eee-8dbf-03082c90dba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed64a73e-6e12-4eee-8dbf-03082c90dba0
Content-Type: application/json

--- request body ---
{"handle":"qa-ebe9820f9608","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed64a73e-6e12-4eee-8dbf-03082c90dba0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_660a50d1-b01c-4376-affc-57a4de518e13"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9c6ce2eb-71e9-4241-9cc5-42fb44dee08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c6ce2eb-71e9-4241-9cc5-42fb44dee08c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dc1c8e90bde0","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c6ce2eb-71e9-4241-9cc5-42fb44dee08c
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
Location: /v1/conversations/cnv_270cc58d-2b40-4691-8e0f-ef03353b4a3f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_270cc58d-2b40-4691-8e0f-ef03353b4a3f","subject":"Error contract","status":"open","region":"eu","participants":["qa-ebe9820f9608","qa-dc1c8e90bde0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.955148317Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6d2d8446-716b-4fdc-813b-0bfd22275948

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d2d8446-716b-4fdc-813b-0bfd22275948
Content-Type: application/json

--- request body ---
{"handle":"qa-f44b0e5fd295","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d2d8446-716b-4fdc-813b-0bfd22275948
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51ec8d49-1b3d-49de-a1d9-5f163a490914"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_270cc58d-2b40-4691-8e0f-ef03353b4a3f/messages
correlation: qa-223548f5-3b30-4958-aedb-820d6dbddd6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-223548f5-3b30-4958-aedb-820d6dbddd6e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-223548f5-3b30-4958-aedb-820d6dbddd6e
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_270cc58d-2b40-4691-8e0f-ef03353b4a3f/messages","correlationId":"qa-223548f5-3b30-4958-aedb-820d6dbddd6e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9154fb1e-d87b-4505-9634-2284f07c7867

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9154fb1e-d87b-4505-9634-2284f07c7867
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9154fb1e-d87b-4505-9634-2284f07c7867
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
correlation: qa-ecb9d9d0-8537-4c3a-9dba-9ce4f577451d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecb9d9d0-8537-4c3a-9dba-9ce4f577451d
Content-Type: application/json

--- request body ---
{"handle":"qa-f44b0e5fd295","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ecb9d9d0-8537-4c3a-9dba-9ce4f577451d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ecb9d9d0-8537-4c3a-9dba-9ce4f577451d"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5e4dbcc4-8757-4f7d-a95a-db9103a35386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4dbcc4-8757-4f7d-a95a-db9103a35386
Content-Type: application/json

--- request body ---
{"handle":"qa-dc1c8e90bde0","password":"****"}

--- response: 200 in 55 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e4dbcc4-8757-4f7d-a95a-db9103a35386
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b7e7b7c-2aa9-47c4-8ae6-d84ce181b26b"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-615f6018-9abd-40c1-ac10-cef381285428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-615f6018-9abd-40c1-ac10-cef381285428
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-615f6018-9abd-40c1-ac10-cef381285428
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
correlation: qa-951c2a0e-78e0-48d9-9076-80eea06061b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-951c2a0e-78e0-48d9-9076-80eea06061b2
Content-Type: application/json

--- request body ---
{"handle":"qa-dc1c8e90bde0","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-951c2a0e-78e0-48d9-9076-80eea06061b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-951c2a0e-78e0-48d9-9076-80eea06061b2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d48c83b-91f1-4c00-8e45-c2b7e5a75c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d48c83b-91f1-4c00-8e45-c2b7e5a75c1b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d48c83b-91f1-4c00-8e45-c2b7e5a75c1b
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
correlation: qa-72034313-8f44-4eaf-8d28-9814f050ab25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72034313-8f44-4eaf-8d28-9814f050ab25
Content-Type: application/json

--- request body ---
{"handle":"qa-ebe9820f9608","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72034313-8f44-4eaf-8d28-9814f050ab25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72034313-8f44-4eaf-8d28-9814f050ab25"}
```
