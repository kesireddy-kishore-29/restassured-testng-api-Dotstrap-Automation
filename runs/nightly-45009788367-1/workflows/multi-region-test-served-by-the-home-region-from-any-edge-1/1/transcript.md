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
| 1 | `POST /v1/accounts` | 201 | 502 | `qa-3a0b7831-3a52-417a-8af0-062430b8f869` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-0fa0afc9-342a-47b9-9444-a5ac8849b4e3` |
| 3 | `GET /v1/accounts/me` | 200 | 60 | `qa-1ff307e9-f970-4449-93cb-ef682c17ad62` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-0689070a-9ccc-4922-a3be-5d71ac8e72ac` |
| 5 | `POST /v1/auth/token` | 401 | 21 | `qa-b75daf09-54ab-49da-8667-467a2527d4df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a0b7831-3a52-417a-8af0-062430b8f869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0b7831-3a52-417a-8af0-062430b8f869
Content-Type: application/json

--- request body ---
{"handle":"qa-c9750a6cd7d1","displayName":"QA c9750a6cd7d1","password":"****","region":"eu"}

--- response: 201 in 502 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0b7831-3a52-417a-8af0-062430b8f869
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-c9750a6cd7d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34b4aa22-f7b0-4223-8c31-9256b85ec512","handle":"qa-c9750a6cd7d1","displayName":"QA c9750a6cd7d1","region":"eu","role":"user","createdAt":"2026-11-22T09:54:48.403089970Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0fa0afc9-342a-47b9-9444-a5ac8849b4e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fa0afc9-342a-47b9-9444-a5ac8849b4e3
Content-Type: application/json

--- request body ---
{"handle":"qa-c9750a6cd7d1","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fa0afc9-342a-47b9-9444-a5ac8849b4e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34b4aa22-f7b0-4223-8c31-9256b85ec512"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1ff307e9-f970-4449-93cb-ef682c17ad62

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-1ff307e9-f970-4449-93cb-ef682c17ad62
Content-Type: application/json

--- response: 200 in 60 ms ---
Date: Sun, 22 Nov 2026 09:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ff307e9-f970-4449-93cb-ef682c17ad62
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

{"id":"acc_34b4aa22-f7b0-4223-8c31-9256b85ec512","handle":"qa-c9750a6cd7d1","displayName":"QA c9750a6cd7d1","region":"eu","role":"user","createdAt":"2026-11-22T09:54:48.403089970Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0689070a-9ccc-4922-a3be-5d71ac8e72ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0689070a-9ccc-4922-a3be-5d71ac8e72ac
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0689070a-9ccc-4922-a3be-5d71ac8e72ac
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
correlation: qa-b75daf09-54ab-49da-8667-467a2527d4df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b75daf09-54ab-49da-8667-467a2527d4df
Content-Type: application/json

--- request body ---
{"handle":"qa-c9750a6cd7d1","password":"****"}

--- response: 401 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b75daf09-54ab-49da-8667-467a2527d4df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b75daf09-54ab-49da-8667-467a2527d4df"}
```
