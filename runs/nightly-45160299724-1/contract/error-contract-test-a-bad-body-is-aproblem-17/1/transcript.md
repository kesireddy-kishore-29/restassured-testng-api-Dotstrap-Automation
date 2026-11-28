# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-3c9d5b57-a967-4b7b-bb35-dcbdf5ee748f` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-97b0c098-b687-457c-afd5-671acd1ef3bd` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-2236fc4a-146a-40c0-aec1-0c4c231a0042` |
| 4 | `POST /v1/conversations` | 201 | 3 | `qa-ffacb035-6da1-479a-b1d9-e476ce47e843` |
| 5 | `POST /v1/credits/purchases` | 422 | 7 | `qa-c7d1ce09-e7e0-437b-9246-1a270ee3ba5b` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-eb7793cb-7b7b-4c51-9fec-6b334dc9420a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-867aeb63-faef-406e-ae9a-b2270bc7ee64` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-e8926e44-e0d0-4163-8750-fe0e263ace23` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-302c7aa1-bd18-4780-96d3-d99509dcc4b4` |
| 10 | `POST /v1/auth/token` | 401 | 34 | `qa-451cdff2-35ab-44fb-9241-29ee32a172f6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c9d5b57-a967-4b7b-bb35-dcbdf5ee748f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c9d5b57-a967-4b7b-bb35-dcbdf5ee748f
Content-Type: application/json

--- request body ---
{"handle":"qa-ff46293e3781","displayName":"QA ff46293e3781","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c9d5b57-a967-4b7b-bb35-dcbdf5ee748f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Location: /v1/accounts/qa-ff46293e3781
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bebc83c3-47c6-4613-89dc-8df1e66a285f","handle":"qa-ff46293e3781","displayName":"QA ff46293e3781","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.230688255Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-97b0c098-b687-457c-afd5-671acd1ef3bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97b0c098-b687-457c-afd5-671acd1ef3bd
Content-Type: application/json

--- request body ---
{"handle":"qa-309ef111a5fb","displayName":"QA 309ef111a5fb","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-97b0c098-b687-457c-afd5-671acd1ef3bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-309ef111a5fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_944ae48e-aabf-4689-b3ca-42a420fe2b18","handle":"qa-309ef111a5fb","displayName":"QA 309ef111a5fb","region":"eu","role":"user","createdAt":"2026-11-23T10:55:00.263342027Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2236fc4a-146a-40c0-aec1-0c4c231a0042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2236fc4a-146a-40c0-aec1-0c4c231a0042
Content-Type: application/json

--- request body ---
{"handle":"qa-ff46293e3781","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-2236fc4a-146a-40c0-aec1-0c4c231a0042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bebc83c3-47c6-4613-89dc-8df1e66a285f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ffacb035-6da1-479a-b1d9-e476ce47e843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffacb035-6da1-479a-b1d9-e476ce47e843
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-309ef111a5fb","subject":"Error contract","message":"Hi"}

--- response: 201 in 3 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ffacb035-6da1-479a-b1d9-e476ce47e843
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
Location: /v1/conversations/cnv_2d5f2fda-1f63-4572-8d1e-56269b452752
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d5f2fda-1f63-4572-8d1e-56269b452752","subject":"Error contract","status":"open","region":"eu","participants":["qa-ff46293e3781","qa-309ef111a5fb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.316278289Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c7d1ce09-e7e0-437b-9246-1a270ee3ba5b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5a5b67d4deca4362b0ee45bd9fea50de
X-Correlation-Id: qa-c7d1ce09-e7e0-437b-9246-1a270ee3ba5b
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7d1ce09-e7e0-437b-9246-1a270ee3ba5b
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-c7d1ce09-e7e0-437b-9246-1a270ee3ba5b","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eb7793cb-7b7b-4c51-9fec-6b334dc9420a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb7793cb-7b7b-4c51-9fec-6b334dc9420a
Content-Type: application/json

--- request body ---
{"handle":"qa-309ef111a5fb","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb7793cb-7b7b-4c51-9fec-6b334dc9420a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_944ae48e-aabf-4689-b3ca-42a420fe2b18"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-867aeb63-faef-406e-ae9a-b2270bc7ee64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-867aeb63-faef-406e-ae9a-b2270bc7ee64
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-867aeb63-faef-406e-ae9a-b2270bc7ee64
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e8926e44-e0d0-4163-8750-fe0e263ace23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8926e44-e0d0-4163-8750-fe0e263ace23
Content-Type: application/json

--- request body ---
{"handle":"qa-309ef111a5fb","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8926e44-e0d0-4163-8750-fe0e263ace23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e8926e44-e0d0-4163-8750-fe0e263ace23"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-302c7aa1-bd18-4780-96d3-d99509dcc4b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-302c7aa1-bd18-4780-96d3-d99509dcc4b4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-302c7aa1-bd18-4780-96d3-d99509dcc4b4
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-451cdff2-35ab-44fb-9241-29ee32a172f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-451cdff2-35ab-44fb-9241-29ee32a172f6
Content-Type: application/json

--- request body ---
{"handle":"qa-ff46293e3781","password":"****"}

--- response: 401 in 34 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-451cdff2-35ab-44fb-9241-29ee32a172f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-451cdff2-35ab-44fb-9241-29ee32a172f6"}
```
