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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-05771a1c-6fd4-4341-a7b0-d78136cb1942` |
| 2 | `POST /v1/auth/token` | 200 | 17 | `qa-3639e81e-b7c0-4247-b0d2-8f227e70a3f0` |
| 3 | `GET /v1/accounts/me` | 200 | 7 | `qa-fb7e83c6-f2ae-4c4f-9cf5-98d5f6675a11` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-96b062e4-7a32-4ef3-9618-3da93f8a2d66` |
| 5 | `POST /v1/auth/token` | 401 | 22 | `qa-d76f2bc7-eae5-457a-bd7a-faf8fb9785c9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-05771a1c-6fd4-4341-a7b0-d78136cb1942

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05771a1c-6fd4-4341-a7b0-d78136cb1942
Content-Type: application/json

--- request body ---
{"handle":"qa-f1c621411d44","displayName":"QA f1c621411d44","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-05771a1c-6fd4-4341-a7b0-d78136cb1942
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-f1c621411d44
X-Served-Region: in
Content-Length: 181

{"id":"acc_6e8141a6-05b3-4023-95c9-64e68ecd286b","handle":"qa-f1c621411d44","displayName":"QA f1c621411d44","region":"in","role":"user","createdAt":"2026-11-11T09:34:23.897913336Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3639e81e-b7c0-4247-b0d2-8f227e70a3f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3639e81e-b7c0-4247-b0d2-8f227e70a3f0
Content-Type: application/json

--- request body ---
{"handle":"qa-f1c621411d44","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3639e81e-b7c0-4247-b0d2-8f227e70a3f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e8141a6-05b3-4023-95c9-64e68ecd286b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fb7e83c6-f2ae-4c4f-9cf5-98d5f6675a11

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-fb7e83c6-f2ae-4c4f-9cf5-98d5f6675a11
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb7e83c6-f2ae-4c4f-9cf5-98d5f6675a11
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

{"id":"acc_6e8141a6-05b3-4023-95c9-64e68ecd286b","handle":"qa-f1c621411d44","displayName":"QA f1c621411d44","region":"in","role":"user","createdAt":"2026-11-11T09:34:23.897913336Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96b062e4-7a32-4ef3-9618-3da93f8a2d66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96b062e4-7a32-4ef3-9618-3da93f8a2d66
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96b062e4-7a32-4ef3-9618-3da93f8a2d66
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
correlation: qa-d76f2bc7-eae5-457a-bd7a-faf8fb9785c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d76f2bc7-eae5-457a-bd7a-faf8fb9785c9
Content-Type: application/json

--- request body ---
{"handle":"qa-f1c621411d44","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d76f2bc7-eae5-457a-bd7a-faf8fb9785c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d76f2bc7-eae5-457a-bd7a-faf8fb9785c9"}
```
