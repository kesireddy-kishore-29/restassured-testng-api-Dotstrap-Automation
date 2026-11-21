# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-3013f9ee-57f8-4f67-9465-9ff0fa8646fe` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-0d5b85e2-a010-4393-a355-bbbb331c82da` |
| 3 | `GET /v1/accounts/me` | 200 | 6 | `qa-0db58091-b2bb-41aa-b194-907821dd04c9` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-38057e17-c45a-4ec2-a36d-a0bcafda1aeb` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-8f16b51c-5f95-4018-95d5-7f340c9a35b6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3013f9ee-57f8-4f67-9465-9ff0fa8646fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3013f9ee-57f8-4f67-9465-9ff0fa8646fe
Content-Type: application/json

--- request body ---
{"handle":"qa-7d2481778ddb","displayName":"QA 7d2481778ddb","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3013f9ee-57f8-4f67-9465-9ff0fa8646fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-7d2481778ddb
X-Served-Region: in
Content-Length: 181

{"id":"acc_edeaabf2-981d-4daf-82f4-5e057fbc4dc3","handle":"qa-7d2481778ddb","displayName":"QA 7d2481778ddb","region":"in","role":"user","createdAt":"2026-11-17T10:50:09.007138422Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0d5b85e2-a010-4393-a355-bbbb331c82da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d5b85e2-a010-4393-a355-bbbb331c82da
Content-Type: application/json

--- request body ---
{"handle":"qa-7d2481778ddb","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d5b85e2-a010-4393-a355-bbbb331c82da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_edeaabf2-981d-4daf-82f4-5e057fbc4dc3"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0db58091-b2bb-41aa-b194-907821dd04c9

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-0db58091-b2bb-41aa-b194-907821dd04c9
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0db58091-b2bb-41aa-b194-907821dd04c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_edeaabf2-981d-4daf-82f4-5e057fbc4dc3","handle":"qa-7d2481778ddb","displayName":"QA 7d2481778ddb","region":"in","role":"user","createdAt":"2026-11-17T10:50:09.007138422Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38057e17-c45a-4ec2-a36d-a0bcafda1aeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38057e17-c45a-4ec2-a36d-a0bcafda1aeb
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38057e17-c45a-4ec2-a36d-a0bcafda1aeb
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8f16b51c-5f95-4018-95d5-7f340c9a35b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f16b51c-5f95-4018-95d5-7f340c9a35b6
Content-Type: application/json

--- request body ---
{"handle":"qa-7d2481778ddb","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f16b51c-5f95-4018-95d5-7f340c9a35b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f16b51c-5f95-4018-95d5-7f340c9a35b6"}
```
