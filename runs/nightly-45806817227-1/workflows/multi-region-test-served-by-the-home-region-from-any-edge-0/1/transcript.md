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
| 1 | `POST /v1/accounts` | 201 | 300 | `qa-60d19c2d-c73a-4a95-8b9f-8d22c947727a` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-f4861385-de01-4e98-bd46-0fb5ff48d443` |
| 3 | `GET /v1/accounts/me` | 200 | 56 | `qa-9bda8fca-e747-4794-9593-c716ed75dc47` |
| 4 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-887ec2ce-c307-4124-8eeb-a8ea55bd4286` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-b64202e0-c010-442d-a736-4a6b07cc2d6f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-60d19c2d-c73a-4a95-8b9f-8d22c947727a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60d19c2d-c73a-4a95-8b9f-8d22c947727a
Content-Type: application/json

--- request body ---
{"handle":"qa-e97e096a4e3f","displayName":"QA e97e096a4e3f","password":"****","region":"in"}

--- response: 201 in 300 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-60d19c2d-c73a-4a95-8b9f-8d22c947727a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e97e096a4e3f
X-Served-Region: in
Content-Length: 181

{"id":"acc_3088f4c4-36c6-4f11-b06e-2659bbc37ab6","handle":"qa-e97e096a4e3f","displayName":"QA e97e096a4e3f","region":"in","role":"user","createdAt":"2026-11-26T11:02:31.635244442Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f4861385-de01-4e98-bd46-0fb5ff48d443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4861385-de01-4e98-bd46-0fb5ff48d443
Content-Type: application/json

--- request body ---
{"handle":"qa-e97e096a4e3f","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4861385-de01-4e98-bd46-0fb5ff48d443
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3088f4c4-36c6-4f11-b06e-2659bbc37ab6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9bda8fca-e747-4794-9593-c716ed75dc47

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-9bda8fca-e747-4794-9593-c716ed75dc47
Content-Type: application/json

--- response: 200 in 56 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bda8fca-e747-4794-9593-c716ed75dc47
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

{"id":"acc_3088f4c4-36c6-4f11-b06e-2659bbc37ab6","handle":"qa-e97e096a4e3f","displayName":"QA e97e096a4e3f","region":"in","role":"user","createdAt":"2026-11-26T11:02:31.635244442Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-887ec2ce-c307-4124-8eeb-a8ea55bd4286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-887ec2ce-c307-4124-8eeb-a8ea55bd4286
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-887ec2ce-c307-4124-8eeb-a8ea55bd4286
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
correlation: qa-b64202e0-c010-442d-a736-4a6b07cc2d6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b64202e0-c010-442d-a736-4a6b07cc2d6f
Content-Type: application/json

--- request body ---
{"handle":"qa-e97e096a4e3f","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b64202e0-c010-442d-a736-4a6b07cc2d6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b64202e0-c010-442d-a736-4a6b07cc2d6f"}
```
