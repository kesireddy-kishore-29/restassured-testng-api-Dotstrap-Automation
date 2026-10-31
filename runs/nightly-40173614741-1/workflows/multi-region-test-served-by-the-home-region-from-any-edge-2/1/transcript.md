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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-a4cb3b67-97ff-4f66-bee6-820958970ef8` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-117fbab4-1be2-41cf-928e-b14196687f99` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-8fde347e-3484-4952-ad78-adf13cb5fc92` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-dac810ed-59dd-401e-b374-f4bbe646739e` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-e411c196-3cfb-405a-8047-e7b7a4e346e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a4cb3b67-97ff-4f66-bee6-820958970ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4cb3b67-97ff-4f66-bee6-820958970ef8
Content-Type: application/json

--- request body ---
{"handle":"qa-026ef3f0553f","displayName":"QA 026ef3f0553f","password":"****","region":"us"}

--- response: 201 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4cb3b67-97ff-4f66-bee6-820958970ef8
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
Location: /v1/accounts/qa-026ef3f0553f
X-Served-Region: us
Content-Length: 181

{"id":"acc_a41d5ff1-3d40-4289-8744-6d9d9a896649","handle":"qa-026ef3f0553f","displayName":"QA 026ef3f0553f","region":"us","role":"user","createdAt":"2026-10-25T07:40:26.850022410Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-117fbab4-1be2-41cf-928e-b14196687f99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-117fbab4-1be2-41cf-928e-b14196687f99
Content-Type: application/json

--- request body ---
{"handle":"qa-026ef3f0553f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-117fbab4-1be2-41cf-928e-b14196687f99
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a41d5ff1-3d40-4289-8744-6d9d9a896649"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8fde347e-3484-4952-ad78-adf13cb5fc92

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-8fde347e-3484-4952-ad78-adf13cb5fc92
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fde347e-3484-4952-ad78-adf13cb5fc92
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

{"id":"acc_a41d5ff1-3d40-4289-8744-6d9d9a896649","handle":"qa-026ef3f0553f","displayName":"QA 026ef3f0553f","region":"us","role":"user","createdAt":"2026-10-25T07:40:26.850022410Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dac810ed-59dd-401e-b374-f4bbe646739e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dac810ed-59dd-401e-b374-f4bbe646739e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dac810ed-59dd-401e-b374-f4bbe646739e
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
correlation: qa-e411c196-3cfb-405a-8047-e7b7a4e346e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e411c196-3cfb-405a-8047-e7b7a4e346e6
Content-Type: application/json

--- request body ---
{"handle":"qa-026ef3f0553f","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e411c196-3cfb-405a-8047-e7b7a4e346e6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e411c196-3cfb-405a-8047-e7b7a4e346e6"}
```
