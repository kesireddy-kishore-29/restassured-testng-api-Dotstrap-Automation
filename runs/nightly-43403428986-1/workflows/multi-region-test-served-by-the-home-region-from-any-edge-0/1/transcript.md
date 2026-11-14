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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-b983ec81-ec92-4040-9c53-d3e3ea3b91b3` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-de9259fd-892e-4c38-bcae-6a21ca55051c` |
| 3 | `GET /v1/accounts/me` | 200 | 17 | `qa-e3dfbd38-3db3-44a1-9bda-8f7a8c3d68d4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-468caa9d-c1ea-4bb6-9d88-64f8505c413b` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-d137a2ac-f354-4d6d-a379-1b2dc70c5965` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b983ec81-ec92-4040-9c53-d3e3ea3b91b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b983ec81-ec92-4040-9c53-d3e3ea3b91b3
Content-Type: application/json

--- request body ---
{"handle":"qa-0552021eba56","displayName":"QA 0552021eba56","password":"****","region":"in"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b983ec81-ec92-4040-9c53-d3e3ea3b91b3
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
Location: /v1/accounts/qa-0552021eba56
X-Served-Region: in
Content-Length: 181

{"id":"acc_d9857a20-8a2c-4748-89c9-31afb211ac5f","handle":"qa-0552021eba56","displayName":"QA 0552021eba56","region":"in","role":"user","createdAt":"2026-11-13T09:42:12.678573165Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-de9259fd-892e-4c38-bcae-6a21ca55051c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de9259fd-892e-4c38-bcae-6a21ca55051c
Content-Type: application/json

--- request body ---
{"handle":"qa-0552021eba56","password":"****"}

--- response: 200 in 22 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-de9259fd-892e-4c38-bcae-6a21ca55051c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d9857a20-8a2c-4748-89c9-31afb211ac5f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e3dfbd38-3db3-44a1-9bda-8f7a8c3d68d4

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-e3dfbd38-3db3-44a1-9bda-8f7a8c3d68d4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3dfbd38-3db3-44a1-9bda-8f7a8c3d68d4
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

{"id":"acc_d9857a20-8a2c-4748-89c9-31afb211ac5f","handle":"qa-0552021eba56","displayName":"QA 0552021eba56","region":"in","role":"user","createdAt":"2026-11-13T09:42:12.678573165Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-468caa9d-c1ea-4bb6-9d88-64f8505c413b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-468caa9d-c1ea-4bb6-9d88-64f8505c413b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-468caa9d-c1ea-4bb6-9d88-64f8505c413b
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
correlation: qa-d137a2ac-f354-4d6d-a379-1b2dc70c5965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d137a2ac-f354-4d6d-a379-1b2dc70c5965
Content-Type: application/json

--- request body ---
{"handle":"qa-0552021eba56","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d137a2ac-f354-4d6d-a379-1b2dc70c5965
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d137a2ac-f354-4d6d-a379-1b2dc70c5965"}
```
