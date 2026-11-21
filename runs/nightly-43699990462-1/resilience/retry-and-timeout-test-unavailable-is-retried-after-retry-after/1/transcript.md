# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-f7b35aca-e5b7-4154-b5d7-0d83f855bf4e` |
| 2 | `POST /v1/auth/token` | 200 | 25 | `qa-180ae792-0159-4d3a-941f-82f06d8255d1` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-a1a0df3c-3efa-48cd-88a3-cc8c6d46c35a` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-dc541dec-8104-4624-a94d-89802abecc80` |
| 5 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-76913e51-25e1-4310-b2b2-280c4c139df1` |
| 6 | `POST /v1/auth/token` | 401 | 16 | `qa-d5ab9500-5316-433c-8dba-970129f13d5a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f7b35aca-e5b7-4154-b5d7-0d83f855bf4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7b35aca-e5b7-4154-b5d7-0d83f855bf4e
Content-Type: application/json

--- request body ---
{"handle":"qa-76f597b769c8","displayName":"QA 76f597b769c8","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7b35aca-e5b7-4154-b5d7-0d83f855bf4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-76f597b769c8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_41e45a08-4b2e-4f8f-8a28-0fb04f5fc38a","handle":"qa-76f597b769c8","displayName":"QA 76f597b769c8","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.608269275Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-180ae792-0159-4d3a-941f-82f06d8255d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-180ae792-0159-4d3a-941f-82f06d8255d1
Content-Type: application/json

--- request body ---
{"handle":"qa-76f597b769c8","password":"****"}

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-180ae792-0159-4d3a-941f-82f06d8255d1
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_41e45a08-4b2e-4f8f-8a28-0fb04f5fc38a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1a0df3c-3efa-48cd-88a3-cc8c6d46c35a

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 203824db-1ad1-482a-9266-aca260e233c3
X-Correlation-Id: qa-a1a0df3c-3efa-48cd-88a3-cc8c6d46c35a
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1a0df3c-3efa-48cd-88a3-cc8c6d46c35a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a1a0df3c-3efa-48cd-88a3-cc8c6d46c35a"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc541dec-8104-4624-a94d-89802abecc80

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 203824db-1ad1-482a-9266-aca260e233c3
X-Correlation-Id: qa-dc541dec-8104-4624-a94d-89802abecc80
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc541dec-8104-4624-a94d-89802abecc80
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

{"id":"acc_41e45a08-4b2e-4f8f-8a28-0fb04f5fc38a","handle":"qa-76f597b769c8","displayName":"QA 76f597b769c8","region":"eu","role":"user","createdAt":"2026-11-15T09:36:14.608269275Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76913e51-25e1-4310-b2b2-280c4c139df1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76913e51-25e1-4310-b2b2-280c4c139df1
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76913e51-25e1-4310-b2b2-280c4c139df1
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d5ab9500-5316-433c-8dba-970129f13d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ab9500-5316-433c-8dba-970129f13d5a
Content-Type: application/json

--- request body ---
{"handle":"qa-76f597b769c8","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5ab9500-5316-433c-8dba-970129f13d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d5ab9500-5316-433c-8dba-970129f13d5a"}
```
