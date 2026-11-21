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
| 1 | `POST /v1/accounts` | 201 | 359 | `qa-5692e5a1-aaa0-4a6f-bed4-3d4eaa8ba1f7` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-2175e781-0cf1-42ae-b3fd-4365a777f7ef` |
| 3 | `GET /v1/accounts/me` | 200 | 37 | `qa-b39888c7-794a-47e2-9e97-bb599ed7cb65` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-1cb089da-17d8-4cc0-804d-8d520d145ff5` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-37446cfd-56af-45a6-bee3-ff5c47a16b43` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5692e5a1-aaa0-4a6f-bed4-3d4eaa8ba1f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5692e5a1-aaa0-4a6f-bed4-3d4eaa8ba1f7
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7093a57a5a","displayName":"QA 7e7093a57a5a","password":"****","region":"in"}

--- response: 201 in 359 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-5692e5a1-aaa0-4a6f-bed4-3d4eaa8ba1f7
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
Location: /v1/accounts/qa-7e7093a57a5a
X-Served-Region: in
Content-Length: 181

{"id":"acc_dbf89ba1-16e5-4094-9121-08fbeaa7ecb4","handle":"qa-7e7093a57a5a","displayName":"QA 7e7093a57a5a","region":"in","role":"user","createdAt":"2026-11-14T09:05:19.238264876Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2175e781-0cf1-42ae-b3fd-4365a777f7ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2175e781-0cf1-42ae-b3fd-4365a777f7ef
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7093a57a5a","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-2175e781-0cf1-42ae-b3fd-4365a777f7ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dbf89ba1-16e5-4094-9121-08fbeaa7ecb4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b39888c7-794a-47e2-9e97-bb599ed7cb65

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-b39888c7-794a-47e2-9e97-bb599ed7cb65
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-b39888c7-794a-47e2-9e97-bb599ed7cb65
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

{"id":"acc_dbf89ba1-16e5-4094-9121-08fbeaa7ecb4","handle":"qa-7e7093a57a5a","displayName":"QA 7e7093a57a5a","region":"in","role":"user","createdAt":"2026-11-14T09:05:19.238264876Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1cb089da-17d8-4cc0-804d-8d520d145ff5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cb089da-17d8-4cc0-804d-8d520d145ff5
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1cb089da-17d8-4cc0-804d-8d520d145ff5
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
correlation: qa-37446cfd-56af-45a6-bee3-ff5c47a16b43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37446cfd-56af-45a6-bee3-ff5c47a16b43
Content-Type: application/json

--- request body ---
{"handle":"qa-7e7093a57a5a","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37446cfd-56af-45a6-bee3-ff5c47a16b43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37446cfd-56af-45a6-bee3-ff5c47a16b43"}
```
