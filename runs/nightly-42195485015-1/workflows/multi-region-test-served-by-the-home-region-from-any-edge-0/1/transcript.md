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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-4ecb9b45-0c19-4431-b2fb-adfdb8492777` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-f63b6dff-e4c2-40c1-ad19-d85cb2933c2a` |
| 3 | `GET /v1/accounts/me` | 200 | 21 | `qa-08f55da4-5753-4f80-9f4a-316894f8bbb2` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-cc4a68f6-76d2-40ef-88ec-25c0c517d314` |
| 5 | `POST /v1/auth/token` | 401 | 17 | `qa-99c8e28f-2e50-402c-b280-fb872a5c85f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ecb9b45-0c19-4431-b2fb-adfdb8492777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ecb9b45-0c19-4431-b2fb-adfdb8492777
Content-Type: application/json

--- request body ---
{"handle":"qa-d19b3ae94add","displayName":"QA d19b3ae94add","password":"****","region":"in"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ecb9b45-0c19-4431-b2fb-adfdb8492777
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-d19b3ae94add
X-Served-Region: in
Content-Length: 181

{"id":"acc_f432b4ae-630b-4ada-9b5e-fc16b3bf0036","handle":"qa-d19b3ae94add","displayName":"QA d19b3ae94add","region":"in","role":"user","createdAt":"2026-11-06T09:30:32.411533294Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f63b6dff-e4c2-40c1-ad19-d85cb2933c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f63b6dff-e4c2-40c1-ad19-d85cb2933c2a
Content-Type: application/json

--- request body ---
{"handle":"qa-d19b3ae94add","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f63b6dff-e4c2-40c1-ad19-d85cb2933c2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f432b4ae-630b-4ada-9b5e-fc16b3bf0036"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-08f55da4-5753-4f80-9f4a-316894f8bbb2

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-08f55da4-5753-4f80-9f4a-316894f8bbb2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-08f55da4-5753-4f80-9f4a-316894f8bbb2
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

{"id":"acc_f432b4ae-630b-4ada-9b5e-fc16b3bf0036","handle":"qa-d19b3ae94add","displayName":"QA d19b3ae94add","region":"in","role":"user","createdAt":"2026-11-06T09:30:32.411533294Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc4a68f6-76d2-40ef-88ec-25c0c517d314

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc4a68f6-76d2-40ef-88ec-25c0c517d314
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc4a68f6-76d2-40ef-88ec-25c0c517d314
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
correlation: qa-99c8e28f-2e50-402c-b280-fb872a5c85f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99c8e28f-2e50-402c-b280-fb872a5c85f4
Content-Type: application/json

--- request body ---
{"handle":"qa-d19b3ae94add","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99c8e28f-2e50-402c-b280-fb872a5c85f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99c8e28f-2e50-402c-b280-fb872a5c85f4"}
```
