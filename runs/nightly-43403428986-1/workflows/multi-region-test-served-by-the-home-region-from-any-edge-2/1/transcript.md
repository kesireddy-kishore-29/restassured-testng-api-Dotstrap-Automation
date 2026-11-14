# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-929792e6-490f-421d-963a-4049cf191196` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-8ecbf991-126e-42f4-8a83-87661fdeb184` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-34af4243-53de-448d-9bbf-0516d1a1ab44` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ac81f7df-e28c-42a3-8a82-50447b68a87c` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-38dd062a-e06d-4686-9d46-bd87bcf3ebf8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-929792e6-490f-421d-963a-4049cf191196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-929792e6-490f-421d-963a-4049cf191196
Content-Type: application/json

--- request body ---
{"handle":"qa-d21eae13f589","displayName":"QA d21eae13f589","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-929792e6-490f-421d-963a-4049cf191196
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
Location: /v1/accounts/qa-d21eae13f589
X-Served-Region: us
Content-Length: 181

{"id":"acc_23177df1-18a7-4a6d-8027-28c7356d46be","handle":"qa-d21eae13f589","displayName":"QA d21eae13f589","region":"us","role":"user","createdAt":"2026-11-13T09:42:12.668747194Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8ecbf991-126e-42f4-8a83-87661fdeb184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ecbf991-126e-42f4-8a83-87661fdeb184
Content-Type: application/json

--- request body ---
{"handle":"qa-d21eae13f589","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ecbf991-126e-42f4-8a83-87661fdeb184
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23177df1-18a7-4a6d-8027-28c7356d46be"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-34af4243-53de-448d-9bbf-0516d1a1ab44

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-34af4243-53de-448d-9bbf-0516d1a1ab44
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-34af4243-53de-448d-9bbf-0516d1a1ab44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_23177df1-18a7-4a6d-8027-28c7356d46be","handle":"qa-d21eae13f589","displayName":"QA d21eae13f589","region":"us","role":"user","createdAt":"2026-11-13T09:42:12.668747194Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac81f7df-e28c-42a3-8a82-50447b68a87c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac81f7df-e28c-42a3-8a82-50447b68a87c
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac81f7df-e28c-42a3-8a82-50447b68a87c
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-38dd062a-e06d-4686-9d46-bd87bcf3ebf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38dd062a-e06d-4686-9d46-bd87bcf3ebf8
Content-Type: application/json

--- request body ---
{"handle":"qa-d21eae13f589","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38dd062a-e06d-4686-9d46-bd87bcf3ebf8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38dd062a-e06d-4686-9d46-bd87bcf3ebf8"}
```
