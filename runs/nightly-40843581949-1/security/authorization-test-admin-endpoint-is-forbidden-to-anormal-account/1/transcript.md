# Transcript: A normal account cannot use the admin endpoint

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#adminEndpointIsForbiddenToANormalAccount` |
| Features | FEAT-SEC-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 357 | `qa-026a3a41-b677-4565-8ed1-521ab5d6f136` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-315bcca6-b199-4599-8076-9159a158adf2` |
| 3 | `GET /v1/admin/stats` | 403 | 60 | `qa-779fbace-310b-4087-8a94-0feb4e1899bc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a7ce1b0f-f0fe-4ecb-8dd2-3428ca1137bc` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-bd50e6d8-0fe1-4226-9d50-72fbe828d9ad` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-026a3a41-b677-4565-8ed1-521ab5d6f136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026a3a41-b677-4565-8ed1-521ab5d6f136
Content-Type: application/json

--- request body ---
{"handle":"qa-bf832131846e","displayName":"QA bf832131846e","password":"****","region":"eu"}

--- response: 201 in 357 ms ---
Date: Thu, 29 Oct 2026 08:38:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-026a3a41-b677-4565-8ed1-521ab5d6f136
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-bf832131846e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e8567476-cc3a-4afb-95b1-c762d03a21d8","handle":"qa-bf832131846e","displayName":"QA bf832131846e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:55.957164766Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-315bcca6-b199-4599-8076-9159a158adf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315bcca6-b199-4599-8076-9159a158adf2
Content-Type: application/json

--- request body ---
{"handle":"qa-bf832131846e","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-315bcca6-b199-4599-8076-9159a158adf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e8567476-cc3a-4afb-95b1-c762d03a21d8"}
```

## 3. GET /v1/admin/stats

```text
#3 GET http://localhost:7070/v1/admin/stats
correlation: qa-779fbace-310b-4087-8a94-0feb4e1899bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-779fbace-310b-4087-8a94-0feb4e1899bc
Content-Type: application/json

--- response: 403 in 60 ms ---
Date: Thu, 29 Oct 2026 08:38:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-779fbace-310b-4087-8a94-0feb4e1899bc
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
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-779fbace-310b-4087-8a94-0feb4e1899bc"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7ce1b0f-f0fe-4ecb-8dd2-3428ca1137bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ce1b0f-f0fe-4ecb-8dd2-3428ca1137bc
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7ce1b0f-f0fe-4ecb-8dd2-3428ca1137bc
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
correlation: qa-bd50e6d8-0fe1-4226-9d50-72fbe828d9ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd50e6d8-0fe1-4226-9d50-72fbe828d9ad
Content-Type: application/json

--- request body ---
{"handle":"qa-bf832131846e","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd50e6d8-0fe1-4226-9d50-72fbe828d9ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd50e6d8-0fe1-4226-9d50-72fbe828d9ad"}
```
