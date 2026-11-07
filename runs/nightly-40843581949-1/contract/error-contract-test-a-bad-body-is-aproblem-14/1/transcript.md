# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 9 | `qa-e49b6732-5fb0-423e-9b0f-6f371e309f44` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-19a91a35-ba4e-4f24-a205-0a80f6a7fe4b` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-72398b86-bbd3-4358-8c16-d3e311015935` |
| 4 | `POST /v1/conversations` | 201 | 37 | `qa-92b9cc11-f8ec-428a-9131-86e2a81ee7af` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 11 | `qa-c5692b46-0b4f-4bd7-88b8-485386fd8d7a` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-b66ef716-36e6-4cff-ad21-fccdbfc0bd46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-cd5929c2-120d-4ac6-89f1-e2579df8b2d5` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-e81c3fcb-0404-4fe0-bfdc-0ec0a760b858` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-c6664142-7a4d-4fe2-9c95-f5b7553fe0fe` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-65ad353d-d063-4e30-85b1-9370832749e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e49b6732-5fb0-423e-9b0f-6f371e309f44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e49b6732-5fb0-423e-9b0f-6f371e309f44
Content-Type: application/json

--- request body ---
{"handle":"qa-674c380eed07","displayName":"QA 674c380eed07","password":"****","region":"eu"}

--- response: 201 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e49b6732-5fb0-423e-9b0f-6f371e309f44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Location: /v1/accounts/qa-674c380eed07
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49eea96d-c8a8-4caf-bbcc-9ca947f1fddb","handle":"qa-674c380eed07","displayName":"QA 674c380eed07","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.008195952Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-19a91a35-ba4e-4f24-a205-0a80f6a7fe4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a91a35-ba4e-4f24-a205-0a80f6a7fe4b
Content-Type: application/json

--- request body ---
{"handle":"qa-1a8c939217c5","displayName":"QA 1a8c939217c5","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-19a91a35-ba4e-4f24-a205-0a80f6a7fe4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Location: /v1/accounts/qa-1a8c939217c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_70171c3f-693f-477e-a3a7-571f7d8adb64","handle":"qa-1a8c939217c5","displayName":"QA 1a8c939217c5","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.037518172Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72398b86-bbd3-4358-8c16-d3e311015935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72398b86-bbd3-4358-8c16-d3e311015935
Content-Type: application/json

--- request body ---
{"handle":"qa-674c380eed07","password":"****"}

--- response: 200 in 14 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-72398b86-bbd3-4358-8c16-d3e311015935
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49eea96d-c8a8-4caf-bbcc-9ca947f1fddb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92b9cc11-f8ec-428a-9131-86e2a81ee7af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b9cc11-f8ec-428a-9131-86e2a81ee7af
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1a8c939217c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b9cc11-f8ec-428a-9131-86e2a81ee7af
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
Location: /v1/conversations/cnv_f0600e3c-a458-458f-8f2b-6bafdf7ab4b6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f0600e3c-a458-458f-8f2b-6bafdf7ab4b6","subject":"Error contract","status":"open","region":"eu","participants":["qa-674c380eed07","qa-1a8c939217c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.097539637Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f0600e3c-a458-458f-8f2b-6bafdf7ab4b6/messages
correlation: qa-c5692b46-0b4f-4bd7-88b8-485386fd8d7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5692b46-0b4f-4bd7-88b8-485386fd8d7a
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5692b46-0b4f-4bd7-88b8-485386fd8d7a
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_f0600e3c-a458-458f-8f2b-6bafdf7ab4b6/messages","correlationId":"qa-c5692b46-0b4f-4bd7-88b8-485386fd8d7a","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b66ef716-36e6-4cff-ad21-fccdbfc0bd46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b66ef716-36e6-4cff-ad21-fccdbfc0bd46
Content-Type: application/json

--- request body ---
{"handle":"qa-1a8c939217c5","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b66ef716-36e6-4cff-ad21-fccdbfc0bd46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_70171c3f-693f-477e-a3a7-571f7d8adb64"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd5929c2-120d-4ac6-89f1-e2579df8b2d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd5929c2-120d-4ac6-89f1-e2579df8b2d5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd5929c2-120d-4ac6-89f1-e2579df8b2d5
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
correlation: qa-e81c3fcb-0404-4fe0-bfdc-0ec0a760b858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e81c3fcb-0404-4fe0-bfdc-0ec0a760b858
Content-Type: application/json

--- request body ---
{"handle":"qa-1a8c939217c5","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e81c3fcb-0404-4fe0-bfdc-0ec0a760b858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e81c3fcb-0404-4fe0-bfdc-0ec0a760b858"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6664142-7a4d-4fe2-9c95-f5b7553fe0fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6664142-7a4d-4fe2-9c95-f5b7553fe0fe
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6664142-7a4d-4fe2-9c95-f5b7553fe0fe
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
correlation: qa-65ad353d-d063-4e30-85b1-9370832749e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65ad353d-d063-4e30-85b1-9370832749e6
Content-Type: application/json

--- request body ---
{"handle":"qa-674c380eed07","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65ad353d-d063-4e30-85b1-9370832749e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65ad353d-d063-4e30-85b1-9370832749e6"}
```
