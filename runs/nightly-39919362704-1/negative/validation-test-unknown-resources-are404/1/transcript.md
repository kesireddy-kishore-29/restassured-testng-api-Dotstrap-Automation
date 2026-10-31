# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 482 | `qa-e9895a94-58dc-49b0-abaa-c884faee29ae` |
| 2 | `POST /v1/auth/token` | 200 | 102 | `qa-b7b67a72-a8e2-40a0-90c7-f6ed235dacad` |
| 3 | `GET /v1/conversations/{id}` | 404 | 103 | `qa-92d5b1d1-0041-4dce-acfa-23da3a0c1637` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 24 | `qa-00e76e82-e18a-4eac-9e23-24cefe443156` |
| 5 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-76a58d3d-0ed7-4b32-85f8-1d3447b59c6e` |
| 6 | `POST /v1/auth/token` | 401 | 27 | `qa-572660c2-0ee6-43d8-a9a0-dffdf9482f93` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e9895a94-58dc-49b0-abaa-c884faee29ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9895a94-58dc-49b0-abaa-c884faee29ae
Content-Type: application/json

--- request body ---
{"handle":"qa-d40991a1cb56","displayName":"QA d40991a1cb56","password":"****","region":"eu"}

--- response: 201 in 482 ms ---
Date: Fri, 23 Oct 2026 07:41:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9895a94-58dc-49b0-abaa-c884faee29ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-d40991a1cb56
X-Served-Region: eu
Content-Length: 181

{"id":"acc_517501d8-b7c7-4a4d-be6f-2de1e2f14c95","handle":"qa-d40991a1cb56","displayName":"QA d40991a1cb56","region":"eu","role":"user","createdAt":"2026-10-23T07:41:15.801607828Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b7b67a72-a8e2-40a0-90c7-f6ed235dacad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7b67a72-a8e2-40a0-90c7-f6ed235dacad
Content-Type: application/json

--- request body ---
{"handle":"qa-d40991a1cb56","password":"****"}

--- response: 200 in 102 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7b67a72-a8e2-40a0-90c7-f6ed235dacad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_517501d8-b7c7-4a4d-be6f-2de1e2f14c95"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-92d5b1d1-0041-4dce-acfa-23da3a0c1637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92d5b1d1-0041-4dce-acfa-23da3a0c1637
Content-Type: application/json

--- response: 404 in 103 ms ---
Date: Fri, 23 Oct 2026 07:41:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92d5b1d1-0041-4dce-acfa-23da3a0c1637
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-92d5b1d1-0041-4dce-acfa-23da3a0c1637"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-00e76e82-e18a-4eac-9e23-24cefe443156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e76e82-e18a-4eac-9e23-24cefe443156
Content-Type: application/json

--- response: 404 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00e76e82-e18a-4eac-9e23-24cefe443156
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-00e76e82-e18a-4eac-9e23-24cefe443156"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-76a58d3d-0ed7-4b32-85f8-1d3447b59c6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76a58d3d-0ed7-4b32-85f8-1d3447b59c6e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-76a58d3d-0ed7-4b32-85f8-1d3447b59c6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-572660c2-0ee6-43d8-a9a0-dffdf9482f93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-572660c2-0ee6-43d8-a9a0-dffdf9482f93
Content-Type: application/json

--- request body ---
{"handle":"qa-d40991a1cb56","password":"****"}

--- response: 401 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-572660c2-0ee6-43d8-a9a0-dffdf9482f93
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-572660c2-0ee6-43d8-a9a0-dffdf9482f93"}
```
