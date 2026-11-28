# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 348 | `qa-1334a0f3-a562-4adc-995d-ae6372219d37` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-d78b35bd-2f46-4b01-989c-a98e27e3b581` |
| 3 | `GET /health` | 200 | 50 | `qa-bb29e980-d73d-47e9-a36a-d04c3a8301b3` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-643a2bf4-e9f3-4539-a0a5-59b576f84be2` |
| 5 | `GET /v1/accounts/me` | 200 | 31 | `qa-6f40c6fe-6163-4fa1-8c17-8eeeb76af4e6` |
| 6 | `PATCH /v1/accounts/me` | 200 | 25 | `qa-d0ff436a-013b-45f2-9921-492e3d52b933` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 15 | `qa-7dbe11d4-76b7-4438-a344-b79081481c45` |
| 8 | `POST /v1/conversations` | 201 | 15 | `qa-48d9e560-0bdc-44e3-8bfe-7773b5bc0d90` |
| 9 | `GET /v1/conversations` | 200 | 9 | `qa-14151715-0066-42c7-a6af-27059988f570` |
| 10 | `POST /v1/auth/token` | 200 | 18 | `qa-8bccbaff-262c-4600-9e89-9cb3ecff7a8c` |
| 11 | `GET /v1/conversations/{id}` | 200 | 12 | `qa-930a13b9-300d-40f9-99a8-f422d5b1b9c1` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-6896767f-4b91-434d-b1b3-ec0bf19ee539` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-92c4489e-9d89-417a-8766-e678c6a79750` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 8 | `qa-b55675fc-c867-44ba-9509-45694bfac6f1` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 10 | `qa-c820d5c2-2f38-4d18-b2ec-07ce685cfb40` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-d8bf45a6-9eff-48b5-ad04-044766558529` |
| 17 | `GET /v1/credits/ledger` | 200 | 21 | `qa-263b476d-d5cd-4fe5-be4a-baec14193047` |
| 18 | `POST /v1/credits/purchases` | 201 | 30 | `qa-45f4e18e-d425-40fd-b5ec-a94d0240f0c8` |
| 19 | `GET /v1/admin/stats` | 403 | 40 | `qa-2d3d3808-b868-4890-959e-b21ace0ab467` |
| 20 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-a9c302b8-6deb-4ce2-b9dd-4d96bd3d670c` |
| 21 | `POST /v1/auth/token` | 401 | 29 | `qa-f0c2eb6b-711d-44e1-8ebc-b647e25d9704` |
| 22 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9cf73ed0-bfba-4853-941d-9733a35ce8e2` |
| 23 | `POST /v1/auth/token` | 401 | 5 | `qa-a4058b9a-76ce-4a6f-9ce1-17a2103e82b9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1334a0f3-a562-4adc-995d-ae6372219d37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1334a0f3-a562-4adc-995d-ae6372219d37
Content-Type: application/json

--- request body ---
{"handle":"qa-f39969e79a44","displayName":"QA f39969e79a44","password":"****","region":"eu"}

--- response: 201 in 348 ms ---
Date: Mon, 23 Nov 2026 10:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-1334a0f3-a562-4adc-995d-ae6372219d37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-f39969e79a44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_773700c6-3d19-49da-b052-397cbfbe636a","handle":"qa-f39969e79a44","displayName":"QA f39969e79a44","region":"eu","role":"user","createdAt":"2026-11-23T10:54:56.886906020Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d78b35bd-2f46-4b01-989c-a98e27e3b581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d78b35bd-2f46-4b01-989c-a98e27e3b581
Content-Type: application/json

--- request body ---
{"handle":"qa-77e912dc954b","displayName":"QA 77e912dc954b","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d78b35bd-2f46-4b01-989c-a98e27e3b581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-77e912dc954b
X-Served-Region: us
Content-Length: 181

{"id":"acc_cfbb2347-b58c-47ff-934c-a7a8ffb69c70","handle":"qa-77e912dc954b","displayName":"QA 77e912dc954b","region":"us","role":"user","createdAt":"2026-11-23T10:54:57.140140142Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-bb29e980-d73d-47e9-a36a-d04c3a8301b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb29e980-d73d-47e9-a36a-d04c3a8301b3
Content-Type: application/json

--- response: 200 in 50 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb29e980-d73d-47e9-a36a-d04c3a8301b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-643a2bf4-e9f3-4539-a0a5-59b576f84be2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643a2bf4-e9f3-4539-a0a5-59b576f84be2
Content-Type: application/json

--- request body ---
{"handle":"qa-f39969e79a44","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-643a2bf4-e9f3-4539-a0a5-59b576f84be2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_773700c6-3d19-49da-b052-397cbfbe636a"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f40c6fe-6163-4fa1-8c17-8eeeb76af4e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f40c6fe-6163-4fa1-8c17-8eeeb76af4e6
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f40c6fe-6163-4fa1-8c17-8eeeb76af4e6
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
Content-Length: 181

{"id":"acc_773700c6-3d19-49da-b052-397cbfbe636a","handle":"qa-f39969e79a44","displayName":"QA f39969e79a44","region":"eu","role":"user","createdAt":"2026-11-23T10:54:56.886906020Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d0ff436a-013b-45f2-9921-492e3d52b933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0ff436a-013b-45f2-9921-492e3d52b933
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0ff436a-013b-45f2-9921-492e3d52b933
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
Content-Length: 178

{"id":"acc_773700c6-3d19-49da-b052-397cbfbe636a","handle":"qa-f39969e79a44","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-23T10:54:56.886906020Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-77e912dc954b
correlation: qa-7dbe11d4-76b7-4438-a344-b79081481c45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7dbe11d4-76b7-4438-a344-b79081481c45
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7dbe11d4-76b7-4438-a344-b79081481c45
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
Content-Length: 74

{"handle":"qa-77e912dc954b","displayName":"QA 77e912dc954b","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-48d9e560-0bdc-44e3-8bfe-7773b5bc0d90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d9e560-0bdc-44e3-8bfe-7773b5bc0d90
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-77e912dc954b","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-48d9e560-0bdc-44e3-8bfe-7773b5bc0d90
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
Location: /v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b
X-Data-Region: us
Content-Length: 238

{"id":"cnv_c11eea44-c180-4497-b073-65148734a59b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-f39969e79a44","qa-77e912dc954b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.420350835Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-14151715-0066-42c7-a6af-27059988f570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14151715-0066-42c7-a6af-27059988f570
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-14151715-0066-42c7-a6af-27059988f570
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
Content-Length: 260

{"items":[{"id":"cnv_c11eea44-c180-4497-b073-65148734a59b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-f39969e79a44","qa-77e912dc954b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.420350835Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8bccbaff-262c-4600-9e89-9cb3ecff7a8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bccbaff-262c-4600-9e89-9cb3ecff7a8c
Content-Type: application/json

--- request body ---
{"handle":"qa-77e912dc954b","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bccbaff-262c-4600-9e89-9cb3ecff7a8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cfbb2347-b58c-47ff-934c-a7a8ffb69c70"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b
correlation: qa-930a13b9-300d-40f9-99a8-f422d5b1b9c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-930a13b9-300d-40f9-99a8-f422d5b1b9c1
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-930a13b9-300d-40f9-99a8-f422d5b1b9c1
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_c11eea44-c180-4497-b073-65148734a59b","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-f39969e79a44","qa-77e912dc954b"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-23T10:54:57.420350835Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b/messages
correlation: qa-6896767f-4b91-434d-b1b3-ec0bf19ee539

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6896767f-4b91-434d-b1b3-ec0bf19ee539
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6896767f-4b91-434d-b1b3-ec0bf19ee539
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_3cf5d626-8ca3-41a6-98a3-080d7e2fc95d","conversationId":"cnv_c11eea44-c180-4497-b073-65148734a59b","sender":"qa-f39969e79a44","body":"Hi","createdAt":"2026-11-23T10:54:57.420370795Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b/messages
correlation: qa-92c4489e-9d89-417a-8766-e678c6a79750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92c4489e-9d89-417a-8766-e678c6a79750
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-92c4489e-9d89-417a-8766-e678c6a79750
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_79fa0560-9b5f-441c-8359-9bcadff889c7","conversationId":"cnv_c11eea44-c180-4497-b073-65148734a59b","sender":"qa-77e912dc954b","body":"Reply","createdAt":"2026-11-23T10:54:57.536571247Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b/read
correlation: qa-b55675fc-c867-44ba-9509-45694bfac6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55675fc-c867-44ba-9509-45694bfac6f1
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b55675fc-c867-44ba-9509-45694bfac6f1
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
Content-Length: 77

{"conversationId":"cnv_c11eea44-c180-4497-b073-65148734a59b","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_c11eea44-c180-4497-b073-65148734a59b/close
correlation: qa-c820d5c2-2f38-4d18-b2ec-07ce685cfb40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c820d5c2-2f38-4d18-b2ec-07ce685cfb40
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c820d5c2-2f38-4d18-b2ec-07ce685cfb40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_c11eea44-c180-4497-b073-65148734a59b","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-f39969e79a44","qa-77e912dc954b"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.420350835Z","closedAt":"2026-11-23T10:54:57.564468726Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-d8bf45a6-9eff-48b5-ad04-044766558529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8bf45a6-9eff-48b5-ad04-044766558529
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8bf45a6-9eff-48b5-ad04-044766558529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_773700c6-3d19-49da-b052-397cbfbe636a"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-263b476d-d5cd-4fe5-be4a-baec14193047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-263b476d-d5cd-4fe5-be4a-baec14193047
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-263b476d-d5cd-4fe5-be4a-baec14193047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_7ed5ec39-fc67-440b-b595-e8a5c788f9ca","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-23T10:54:56.886936176Z"},{"id":"led_bea8698c-6929-430c-82fe-ece4899f98b8","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_c11eea44-c180-4497-b073-65148734a59b","createdAt":"2026-11-23T10:54:57.420336994Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-45f4e18e-d425-40fd-b5ec-a94d0240f0c8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8aca7531a4eb4dfbb7ead2ad7ef91570
X-Correlation-Id: qa-45f4e18e-d425-40fd-b5ec-a94d0240f0c8
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 30 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-45f4e18e-d425-40fd-b5ec-a94d0240f0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_aa1cbaae-f1d4-4bce-b021-392d97b19a20
Content-Length: 144

{"id":"pur_aa1cbaae-f1d4-4bce-b021-392d97b19a20","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-23T10:54:57.660167803Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-2d3d3808-b868-4890-959e-b21ace0ab467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d3d3808-b868-4890-959e-b21ace0ab467
Content-Type: application/json

--- response: 403 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d3d3808-b868-4890-959e-b21ace0ab467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-2d3d3808-b868-4890-959e-b21ace0ab467"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a9c302b8-6deb-4ce2-b9dd-4d96bd3d670c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9c302b8-6deb-4ce2-b9dd-4d96bd3d670c
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a9c302b8-6deb-4ce2-b9dd-4d96bd3d670c
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-f0c2eb6b-711d-44e1-8ebc-b647e25d9704

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0c2eb6b-711d-44e1-8ebc-b647e25d9704
Content-Type: application/json

--- request body ---
{"handle":"qa-77e912dc954b","password":"****"}

--- response: 401 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0c2eb6b-711d-44e1-8ebc-b647e25d9704
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0c2eb6b-711d-44e1-8ebc-b647e25d9704"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cf73ed0-bfba-4853-941d-9733a35ce8e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cf73ed0-bfba-4853-941d-9733a35ce8e2
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cf73ed0-bfba-4853-941d-9733a35ce8e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-a4058b9a-76ce-4a6f-9ce1-17a2103e82b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4058b9a-76ce-4a6f-9ce1-17a2103e82b9
Content-Type: application/json

--- request body ---
{"handle":"qa-f39969e79a44","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4058b9a-76ce-4a6f-9ce1-17a2103e82b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4058b9a-76ce-4a6f-9ce1-17a2103e82b9"}
```
