# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-77c9556e-65d9-4d3e-97dc-64dd0463eaf8` |
| 2 | `POST /v1/accounts` | 201 | 57 | `qa-7eb596e2-37f6-4836-828b-1fb865415dd7` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-98f61340-f4b5-4afd-a77b-2454981318ff` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-c6a2756f-0409-4b5e-8c12-bc89708a10f6` |
| 5 | `PATCH /v1/accounts/me` | 415 | 20 | `qa-efaf6003-8580-4a5b-b58e-c724d7c1cab4` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-8334fc36-3368-4f2c-a532-87df596f4565` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b799c324-537b-4014-b64e-56968d0dcb3a` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-252ad27c-e4f9-4f98-ae2b-ee88ca7b5941` |
| 9 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-f8482827-1862-43a2-9fea-eb88dc74d0b1` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-06d7bdb6-cf7b-4b33-a4fe-f4284e410eb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-77c9556e-65d9-4d3e-97dc-64dd0463eaf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77c9556e-65d9-4d3e-97dc-64dd0463eaf8
Content-Type: application/json

--- request body ---
{"handle":"qa-58c97026604a","displayName":"QA 58c97026604a","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-77c9556e-65d9-4d3e-97dc-64dd0463eaf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Location: /v1/accounts/qa-58c97026604a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16295d94-423e-42fc-a05a-b7fc224ea6a6","handle":"qa-58c97026604a","displayName":"QA 58c97026604a","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.058890337Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7eb596e2-37f6-4836-828b-1fb865415dd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb596e2-37f6-4836-828b-1fb865415dd7
Content-Type: application/json

--- request body ---
{"handle":"qa-6066faba6b44","displayName":"QA 6066faba6b44","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb596e2-37f6-4836-828b-1fb865415dd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-6066faba6b44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba89518f-bef3-4830-b3fa-ee95df937968","handle":"qa-6066faba6b44","displayName":"QA 6066faba6b44","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.158670640Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98f61340-f4b5-4afd-a77b-2454981318ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98f61340-f4b5-4afd-a77b-2454981318ff
Content-Type: application/json

--- request body ---
{"handle":"qa-58c97026604a","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-98f61340-f4b5-4afd-a77b-2454981318ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16295d94-423e-42fc-a05a-b7fc224ea6a6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c6a2756f-0409-4b5e-8c12-bc89708a10f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6a2756f-0409-4b5e-8c12-bc89708a10f6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6066faba6b44","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6a2756f-0409-4b5e-8c12-bc89708a10f6
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
Location: /v1/conversations/cnv_cc2c8e08-16af-4fc9-ac7d-70267d6a51d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cc2c8e08-16af-4fc9-ac7d-70267d6a51d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-58c97026604a","qa-6066faba6b44"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.274216558Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-efaf6003-8580-4a5b-b58e-c724d7c1cab4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efaf6003-8580-4a5b-b58e-c724d7c1cab4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efaf6003-8580-4a5b-b58e-c724d7c1cab4
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-efaf6003-8580-4a5b-b58e-c724d7c1cab4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8334fc36-3368-4f2c-a532-87df596f4565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8334fc36-3368-4f2c-a532-87df596f4565
Content-Type: application/json

--- request body ---
{"handle":"qa-6066faba6b44","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8334fc36-3368-4f2c-a532-87df596f4565
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba89518f-bef3-4830-b3fa-ee95df937968"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b799c324-537b-4014-b64e-56968d0dcb3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b799c324-537b-4014-b64e-56968d0dcb3a
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b799c324-537b-4014-b64e-56968d0dcb3a
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
correlation: qa-252ad27c-e4f9-4f98-ae2b-ee88ca7b5941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-252ad27c-e4f9-4f98-ae2b-ee88ca7b5941
Content-Type: application/json

--- request body ---
{"handle":"qa-6066faba6b44","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-252ad27c-e4f9-4f98-ae2b-ee88ca7b5941
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-252ad27c-e4f9-4f98-ae2b-ee88ca7b5941"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8482827-1862-43a2-9fea-eb88dc74d0b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8482827-1862-43a2-9fea-eb88dc74d0b1
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8482827-1862-43a2-9fea-eb88dc74d0b1
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
correlation: qa-06d7bdb6-cf7b-4b33-a4fe-f4284e410eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06d7bdb6-cf7b-4b33-a4fe-f4284e410eb7
Content-Type: application/json

--- request body ---
{"handle":"qa-58c97026604a","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-06d7bdb6-cf7b-4b33-a4fe-f4284e410eb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-06d7bdb6-cf7b-4b33-a4fe-f4284e410eb7"}
```
