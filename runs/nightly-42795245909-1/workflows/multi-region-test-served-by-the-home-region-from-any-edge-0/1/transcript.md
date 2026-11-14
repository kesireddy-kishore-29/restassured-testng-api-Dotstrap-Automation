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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-dd359501-0955-4857-8dd1-1023d8bcfb92` |
| 2 | `POST /v1/auth/token` | 200 | 8 | `qa-3aecb64c-75cb-4b9f-9f89-a16670b6389a` |
| 3 | `GET /v1/accounts/me` | 200 | 9 | `qa-131a7fec-550b-4fb1-af0d-3f6304009416` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cd87f79b-273c-464b-a199-026f4b5ec2da` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-2512cc1c-6ac6-4c6c-8056-a7438f924f6d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dd359501-0955-4857-8dd1-1023d8bcfb92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd359501-0955-4857-8dd1-1023d8bcfb92
Content-Type: application/json

--- request body ---
{"handle":"qa-18dcde100075","displayName":"QA 18dcde100075","password":"****","region":"in"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd359501-0955-4857-8dd1-1023d8bcfb92
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
Location: /v1/accounts/qa-18dcde100075
X-Served-Region: in
Content-Length: 181

{"id":"acc_216de0bb-90de-4d49-8ffd-3a09a5efb819","handle":"qa-18dcde100075","displayName":"QA 18dcde100075","region":"in","role":"user","createdAt":"2026-11-10T09:59:34.211181047Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3aecb64c-75cb-4b9f-9f89-a16670b6389a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aecb64c-75cb-4b9f-9f89-a16670b6389a
Content-Type: application/json

--- request body ---
{"handle":"qa-18dcde100075","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aecb64c-75cb-4b9f-9f89-a16670b6389a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_216de0bb-90de-4d49-8ffd-3a09a5efb819"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-131a7fec-550b-4fb1-af0d-3f6304009416

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-131a7fec-550b-4fb1-af0d-3f6304009416
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-131a7fec-550b-4fb1-af0d-3f6304009416
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

{"id":"acc_216de0bb-90de-4d49-8ffd-3a09a5efb819","handle":"qa-18dcde100075","displayName":"QA 18dcde100075","region":"in","role":"user","createdAt":"2026-11-10T09:59:34.211181047Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd87f79b-273c-464b-a199-026f4b5ec2da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd87f79b-273c-464b-a199-026f4b5ec2da
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd87f79b-273c-464b-a199-026f4b5ec2da
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
correlation: qa-2512cc1c-6ac6-4c6c-8056-a7438f924f6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2512cc1c-6ac6-4c6c-8056-a7438f924f6d
Content-Type: application/json

--- request body ---
{"handle":"qa-18dcde100075","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2512cc1c-6ac6-4c6c-8056-a7438f924f6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2512cc1c-6ac6-4c6c-8056-a7438f924f6d"}
```
