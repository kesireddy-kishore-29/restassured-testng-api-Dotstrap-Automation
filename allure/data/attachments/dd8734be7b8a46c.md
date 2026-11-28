# Transcript: Requests are served by the home region, whichever edge they arrive at [EU, us]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[1]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-dea25c33-cf56-4d5e-975a-84c93cc600b8` |
| 2 | `POST /v1/auth/token` | 200 | 61 | `qa-50222b67-f33e-45f6-977f-33085a91093a` |
| 3 | `GET /v1/accounts/me` | 200 | 63 | `qa-950ed1ab-16c0-4a67-ac3d-99354f8c840f` |
| 4 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-6871b4c4-07d0-4112-bf64-3990544b21f6` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-a6df23be-1fb9-4612-a817-6092f6754cd9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dea25c33-cf56-4d5e-975a-84c93cc600b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea25c33-cf56-4d5e-975a-84c93cc600b8
Content-Type: application/json

--- request body ---
{"handle":"qa-cf402c378992","displayName":"QA cf402c378992","password":"****","region":"eu"}

--- response: 201 in 502 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea25c33-cf56-4d5e-975a-84c93cc600b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-cf402c378992
X-Served-Region: eu
Content-Length: 181

{"id":"acc_110bfa42-db7b-403f-8c86-692e7c5b946e","handle":"qa-cf402c378992","displayName":"QA cf402c378992","region":"eu","role":"user","createdAt":"2026-11-28T10:37:19.398613752Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-50222b67-f33e-45f6-977f-33085a91093a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50222b67-f33e-45f6-977f-33085a91093a
Content-Type: application/json

--- request body ---
{"handle":"qa-cf402c378992","password":"****"}

--- response: 200 in 61 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-50222b67-f33e-45f6-977f-33085a91093a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_110bfa42-db7b-403f-8c86-692e7c5b946e"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-950ed1ab-16c0-4a67-ac3d-99354f8c840f

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-950ed1ab-16c0-4a67-ac3d-99354f8c840f
Content-Type: application/json

--- response: 200 in 63 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-950ed1ab-16c0-4a67-ac3d-99354f8c840f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: us
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_110bfa42-db7b-403f-8c86-692e7c5b946e","handle":"qa-cf402c378992","displayName":"QA cf402c378992","region":"eu","role":"user","createdAt":"2026-11-28T10:37:19.398613752Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6871b4c4-07d0-4112-bf64-3990544b21f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6871b4c4-07d0-4112-bf64-3990544b21f6
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6871b4c4-07d0-4112-bf64-3990544b21f6
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
correlation: qa-a6df23be-1fb9-4612-a817-6092f6754cd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6df23be-1fb9-4612-a817-6092f6754cd9
Content-Type: application/json

--- request body ---
{"handle":"qa-cf402c378992","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6df23be-1fb9-4612-a817-6092f6754cd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6df23be-1fb9-4612-a817-6092f6754cd9"}
```
