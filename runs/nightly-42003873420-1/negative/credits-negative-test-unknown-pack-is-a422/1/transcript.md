# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-5ee51c64-eced-4c41-b87f-b5c69a812a8c` |
| 2 | `POST /v1/auth/token` | 200 | 66 | `qa-74014b5d-c178-4426-ad5c-f537a28c6b2e` |
| 3 | `POST /v1/credits/purchases` | 422 | 20 | `qa-1cf7a760-53c1-4b06-977b-277fca77e71f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-21b0d526-21b2-40fa-baeb-c27c3d1e7501` |
| 5 | `POST /v1/auth/token` | 401 | 22 | `qa-ec096acb-6708-47cc-930f-535a70c57c0f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5ee51c64-eced-4c41-b87f-b5c69a812a8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee51c64-eced-4c41-b87f-b5c69a812a8c
Content-Type: application/json

--- request body ---
{"handle":"qa-1e9892512431","displayName":"QA 1e9892512431","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ee51c64-eced-4c41-b87f-b5c69a812a8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 9
Location: /v1/accounts/qa-1e9892512431
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da60806c-5795-431e-b315-bdc6626495e2","handle":"qa-1e9892512431","displayName":"QA 1e9892512431","region":"eu","role":"user","createdAt":"2026-11-05T09:37:55.199199051Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-74014b5d-c178-4426-ad5c-f537a28c6b2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74014b5d-c178-4426-ad5c-f537a28c6b2e
Content-Type: application/json

--- request body ---
{"handle":"qa-1e9892512431","password":"****"}

--- response: 200 in 66 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-74014b5d-c178-4426-ad5c-f537a28c6b2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da60806c-5795-431e-b315-bdc6626495e2"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1cf7a760-53c1-4b06-977b-277fca77e71f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ee8f102ed09146a499f0f9a75665fe48
X-Correlation-Id: qa-1cf7a760-53c1-4b06-977b-277fca77e71f
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cf7a760-53c1-4b06-977b-277fca77e71f
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-1cf7a760-53c1-4b06-977b-277fca77e71f","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21b0d526-21b2-40fa-baeb-c27c3d1e7501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21b0d526-21b2-40fa-baeb-c27c3d1e7501
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21b0d526-21b2-40fa-baeb-c27c3d1e7501
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ec096acb-6708-47cc-930f-535a70c57c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec096acb-6708-47cc-930f-535a70c57c0f
Content-Type: application/json

--- request body ---
{"handle":"qa-1e9892512431","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec096acb-6708-47cc-930f-535a70c57c0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec096acb-6708-47cc-930f-535a70c57c0f"}
```
