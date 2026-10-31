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
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-4ed5b739-45af-4911-ae4f-26fe00bb483e` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-5ed5e908-cc53-4f33-95eb-07a7175005c7` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-37c27978-5d61-4cb6-a05a-dd52f1ce2228` |
| 4 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-fb708beb-fe32-4634-9673-3deec2ce55f8` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-fd01045d-72e1-4372-82da-27beb10a4b69` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4ed5b739-45af-4911-ae4f-26fe00bb483e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ed5b739-45af-4911-ae4f-26fe00bb483e
Content-Type: application/json

--- request body ---
{"handle":"qa-33eaf87234d3","displayName":"QA 33eaf87234d3","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ed5b739-45af-4911-ae4f-26fe00bb483e
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
Location: /v1/accounts/qa-33eaf87234d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0389f93a-b4e9-4f12-84d8-7177a9ac41f7","handle":"qa-33eaf87234d3","displayName":"QA 33eaf87234d3","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.852155677Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5ed5e908-cc53-4f33-95eb-07a7175005c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed5e908-cc53-4f33-95eb-07a7175005c7
Content-Type: application/json

--- request body ---
{"handle":"qa-33eaf87234d3","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ed5e908-cc53-4f33-95eb-07a7175005c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0389f93a-b4e9-4f12-84d8-7177a9ac41f7"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-37c27978-5d61-4cb6-a05a-dd52f1ce2228

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-37c27978-5d61-4cb6-a05a-dd52f1ce2228
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-37c27978-5d61-4cb6-a05a-dd52f1ce2228
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

{"id":"acc_0389f93a-b4e9-4f12-84d8-7177a9ac41f7","handle":"qa-33eaf87234d3","displayName":"QA 33eaf87234d3","region":"eu","role":"user","createdAt":"2026-10-23T07:41:45.852155677Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb708beb-fe32-4634-9673-3deec2ce55f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb708beb-fe32-4634-9673-3deec2ce55f8
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb708beb-fe32-4634-9673-3deec2ce55f8
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
correlation: qa-fd01045d-72e1-4372-82da-27beb10a4b69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd01045d-72e1-4372-82da-27beb10a4b69
Content-Type: application/json

--- request body ---
{"handle":"qa-33eaf87234d3","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd01045d-72e1-4372-82da-27beb10a4b69
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fd01045d-72e1-4372-82da-27beb10a4b69"}
```
