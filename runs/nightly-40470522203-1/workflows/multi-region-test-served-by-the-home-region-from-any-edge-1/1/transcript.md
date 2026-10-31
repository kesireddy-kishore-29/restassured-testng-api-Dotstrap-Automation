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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-727b2420-bf78-49ac-b2d0-1ced0e417d0f` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-1b16de9e-7e3c-450d-971e-a54018bcf146` |
| 3 | `GET /v1/accounts/me` | 200 | 17 | `qa-e5ee3346-ea46-438e-8ac4-5a33b883e97e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-63efdd47-9b9b-474a-a2f1-5be734a1be48` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-2d43425b-6d3b-4778-9d01-12f4551a48d4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-727b2420-bf78-49ac-b2d0-1ced0e417d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-727b2420-bf78-49ac-b2d0-1ced0e417d0f
Content-Type: application/json

--- request body ---
{"handle":"qa-a309516211f3","displayName":"QA a309516211f3","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-727b2420-bf78-49ac-b2d0-1ced0e417d0f
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
Location: /v1/accounts/qa-a309516211f3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19f75855-9a4c-4648-8334-0f806a6d3a05","handle":"qa-a309516211f3","displayName":"QA a309516211f3","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.628235662Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1b16de9e-7e3c-450d-971e-a54018bcf146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b16de9e-7e3c-450d-971e-a54018bcf146
Content-Type: application/json

--- request body ---
{"handle":"qa-a309516211f3","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b16de9e-7e3c-450d-971e-a54018bcf146
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19f75855-9a4c-4648-8334-0f806a6d3a05"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5ee3346-ea46-438e-8ac4-5a33b883e97e

--- request headers ---
Accept: application/json
X-Edge-Region: us
X-Correlation-Id: qa-e5ee3346-ea46-438e-8ac4-5a33b883e97e
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5ee3346-ea46-438e-8ac4-5a33b883e97e
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

{"id":"acc_19f75855-9a4c-4648-8334-0f806a6d3a05","handle":"qa-a309516211f3","displayName":"QA a309516211f3","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.628235662Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-63efdd47-9b9b-474a-a2f1-5be734a1be48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63efdd47-9b9b-474a-a2f1-5be734a1be48
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-63efdd47-9b9b-474a-a2f1-5be734a1be48
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
correlation: qa-2d43425b-6d3b-4778-9d01-12f4551a48d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d43425b-6d3b-4778-9d01-12f4551a48d4
Content-Type: application/json

--- request body ---
{"handle":"qa-a309516211f3","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2d43425b-6d3b-4778-9d01-12f4551a48d4
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2d43425b-6d3b-4778-9d01-12f4551a48d4"}
```
