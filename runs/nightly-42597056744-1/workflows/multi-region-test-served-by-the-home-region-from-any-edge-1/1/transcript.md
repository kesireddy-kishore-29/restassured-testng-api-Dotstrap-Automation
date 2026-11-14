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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-328e2b7c-529a-482d-9a3e-e5b24036f339` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-64a537ee-4689-4e6c-8d1e-2abbe2a72fd9` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-e0b02ea7-f793-4922-8f4d-80cc3d416a51` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-244fb4fc-bbc7-4654-8923-1bdf70648241` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-68014c19-5eb8-4cd9-8700-7bcf9711f411` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-328e2b7c-529a-482d-9a3e-e5b24036f339

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-328e2b7c-529a-482d-9a3e-e5b24036f339
Content-Type: application/json

--- request body ---
{"handle":"qa-722cd090b3ae","displayName":"QA 722cd090b3ae","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-328e2b7c-529a-482d-9a3e-e5b24036f339
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-722cd090b3ae
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ba578ccc-58d4-40d7-ae6b-5ede275e6305","handle":"qa-722cd090b3ae","displayName":"QA 722cd090b3ae","region":"eu","role":"user","createdAt":"2026-11-09T09:56:00.586560894Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-64a537ee-4689-4e6c-8d1e-2abbe2a72fd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a537ee-4689-4e6c-8d1e-2abbe2a72fd9
Content-Type: application/json

--- request body ---
{"handle":"qa-722cd090b3ae","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-64a537ee-4689-4e6c-8d1e-2abbe2a72fd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ba578ccc-58d4-40d7-ae6b-5ede275e6305"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0b02ea7-f793-4922-8f4d-80cc3d416a51

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-e0b02ea7-f793-4922-8f4d-80cc3d416a51
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0b02ea7-f793-4922-8f4d-80cc3d416a51
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

{"id":"acc_ba578ccc-58d4-40d7-ae6b-5ede275e6305","handle":"qa-722cd090b3ae","displayName":"QA 722cd090b3ae","region":"eu","role":"user","createdAt":"2026-11-09T09:56:00.586560894Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-244fb4fc-bbc7-4654-8923-1bdf70648241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-244fb4fc-bbc7-4654-8923-1bdf70648241
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-244fb4fc-bbc7-4654-8923-1bdf70648241
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
correlation: qa-68014c19-5eb8-4cd9-8700-7bcf9711f411

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68014c19-5eb8-4cd9-8700-7bcf9711f411
Content-Type: application/json

--- request body ---
{"handle":"qa-722cd090b3ae","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68014c19-5eb8-4cd9-8700-7bcf9711f411
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68014c19-5eb8-4cd9-8700-7bcf9711f411"}
```
