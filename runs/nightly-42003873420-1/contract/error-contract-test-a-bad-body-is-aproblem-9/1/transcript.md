# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-b0f56b0c-4e54-4de3-977f-2a45694bf049` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-ef18fa43-fb89-426e-9215-cc4bfccc9bf8` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-ba059cbc-ddb8-4d18-9637-bd5e40481115` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-c91bf71f-738f-4ed2-a0d6-52ba156ef583` |
| 5 | `POST /v1/conversations` | 400 | 8 | `qa-387b6ef0-cbcb-448f-bb42-2ad9c2cdb8e1` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-817d12b3-4352-43dd-8bac-716f44543c91` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-eef668c1-cc69-4fda-ade8-b2c05f6febac` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-a223cc4c-e6e4-4dda-8b9b-efd173c77d34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-2ea58106-5c77-498f-917d-b57d0b0b24e0` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-f8371a1b-a401-47a4-a2cf-9f8a9fdc96dd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0f56b0c-4e54-4de3-977f-2a45694bf049

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0f56b0c-4e54-4de3-977f-2a45694bf049
Content-Type: application/json

--- request body ---
{"handle":"qa-8311b698a3d3","displayName":"QA 8311b698a3d3","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0f56b0c-4e54-4de3-977f-2a45694bf049
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Location: /v1/accounts/qa-8311b698a3d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a9525c6b-1796-4409-9d91-7f60ddb4a131","handle":"qa-8311b698a3d3","displayName":"QA 8311b698a3d3","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.139089875Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ef18fa43-fb89-426e-9215-cc4bfccc9bf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef18fa43-fb89-426e-9215-cc4bfccc9bf8
Content-Type: application/json

--- request body ---
{"handle":"qa-d768309d8ec7","displayName":"QA d768309d8ec7","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef18fa43-fb89-426e-9215-cc4bfccc9bf8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-d768309d8ec7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_26c614f3-ff3e-4b83-ae56-e13f6be79f1f","handle":"qa-d768309d8ec7","displayName":"QA d768309d8ec7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.220213160Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba059cbc-ddb8-4d18-9637-bd5e40481115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba059cbc-ddb8-4d18-9637-bd5e40481115
Content-Type: application/json

--- request body ---
{"handle":"qa-8311b698a3d3","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba059cbc-ddb8-4d18-9637-bd5e40481115
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a9525c6b-1796-4409-9d91-7f60ddb4a131"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c91bf71f-738f-4ed2-a0d6-52ba156ef583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c91bf71f-738f-4ed2-a0d6-52ba156ef583
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d768309d8ec7","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c91bf71f-738f-4ed2-a0d6-52ba156ef583
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
Location: /v1/conversations/cnv_28f43a5a-f03d-4b93-b995-5fee81881499
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_28f43a5a-f03d-4b93-b995-5fee81881499","subject":"Error contract","status":"open","region":"eu","participants":["qa-8311b698a3d3","qa-d768309d8ec7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.316954016Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-387b6ef0-cbcb-448f-bb42-2ad9c2cdb8e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-387b6ef0-cbcb-448f-bb42-2ad9c2cdb8e1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-387b6ef0-cbcb-448f-bb42-2ad9c2cdb8e1
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-387b6ef0-cbcb-448f-bb42-2ad9c2cdb8e1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-817d12b3-4352-43dd-8bac-716f44543c91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-817d12b3-4352-43dd-8bac-716f44543c91
Content-Type: application/json

--- request body ---
{"handle":"qa-d768309d8ec7","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-817d12b3-4352-43dd-8bac-716f44543c91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_26c614f3-ff3e-4b83-ae56-e13f6be79f1f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eef668c1-cc69-4fda-ade8-b2c05f6febac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef668c1-cc69-4fda-ade8-b2c05f6febac
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eef668c1-cc69-4fda-ade8-b2c05f6febac
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a223cc4c-e6e4-4dda-8b9b-efd173c77d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a223cc4c-e6e4-4dda-8b9b-efd173c77d34
Content-Type: application/json

--- request body ---
{"handle":"qa-d768309d8ec7","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a223cc4c-e6e4-4dda-8b9b-efd173c77d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a223cc4c-e6e4-4dda-8b9b-efd173c77d34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ea58106-5c77-498f-917d-b57d0b0b24e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ea58106-5c77-498f-917d-b57d0b0b24e0
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ea58106-5c77-498f-917d-b57d0b0b24e0
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f8371a1b-a401-47a4-a2cf-9f8a9fdc96dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8371a1b-a401-47a4-a2cf-9f8a9fdc96dd
Content-Type: application/json

--- request body ---
{"handle":"qa-8311b698a3d3","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8371a1b-a401-47a4-a2cf-9f8a9fdc96dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8371a1b-a401-47a4-a2cf-9f8a9fdc96dd"}
```
