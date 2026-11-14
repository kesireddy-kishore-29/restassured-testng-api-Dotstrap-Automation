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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-d95cef27-1385-4473-9302-1d251e657638` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-4ab512d2-08b7-4edc-a789-73f697931630` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-105313df-d3b7-45ef-b1d7-6245bc8f7420` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-e2983c8c-536f-4de1-82b9-c7dd220a294c` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-13eea488-b234-4205-86af-a3107b5a46a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d95cef27-1385-4473-9302-1d251e657638

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d95cef27-1385-4473-9302-1d251e657638
Content-Type: application/json

--- request body ---
{"handle":"qa-caa76bd1615a","displayName":"QA caa76bd1615a","password":"****","region":"in"}

--- response: 201 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d95cef27-1385-4473-9302-1d251e657638
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
Location: /v1/accounts/qa-caa76bd1615a
X-Served-Region: in
Content-Length: 181

{"id":"acc_2303b8af-9c51-4d21-a0a8-f68d0a6fbdee","handle":"qa-caa76bd1615a","displayName":"QA caa76bd1615a","region":"in","role":"user","createdAt":"2026-11-08T09:09:10.461320191Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4ab512d2-08b7-4edc-a789-73f697931630

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab512d2-08b7-4edc-a789-73f697931630
Content-Type: application/json

--- request body ---
{"handle":"qa-caa76bd1615a","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ab512d2-08b7-4edc-a789-73f697931630
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2303b8af-9c51-4d21-a0a8-f68d0a6fbdee"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-105313df-d3b7-45ef-b1d7-6245bc8f7420

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-105313df-d3b7-45ef-b1d7-6245bc8f7420
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-105313df-d3b7-45ef-b1d7-6245bc8f7420
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

{"id":"acc_2303b8af-9c51-4d21-a0a8-f68d0a6fbdee","handle":"qa-caa76bd1615a","displayName":"QA caa76bd1615a","region":"in","role":"user","createdAt":"2026-11-08T09:09:10.461320191Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e2983c8c-536f-4de1-82b9-c7dd220a294c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2983c8c-536f-4de1-82b9-c7dd220a294c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e2983c8c-536f-4de1-82b9-c7dd220a294c
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
correlation: qa-13eea488-b234-4205-86af-a3107b5a46a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13eea488-b234-4205-86af-a3107b5a46a3
Content-Type: application/json

--- request body ---
{"handle":"qa-caa76bd1615a","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13eea488-b234-4205-86af-a3107b5a46a3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-13eea488-b234-4205-86af-a3107b5a46a3"}
```
