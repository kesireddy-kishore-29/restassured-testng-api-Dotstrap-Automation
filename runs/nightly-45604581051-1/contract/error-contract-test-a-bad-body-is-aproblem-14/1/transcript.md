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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-28842403-7018-4ac2-859f-287e304bb1da` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-506675f5-98a8-4cb6-8ba8-7159d4cab7f7` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-5d3490ae-aa22-449f-8f8c-c2d489cfd700` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-8b6837b6-29b8-41b6-9261-9088722acee7` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 20 | `qa-f6cd71af-7dbf-4101-b112-98c2301c8bbe` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-d8578bf4-fe25-4853-9009-ad277a1a7c73` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-b52bec9b-4120-4f5f-aa35-606eb7655f5e` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-2aaa6253-eb10-458f-b4d3-e81bb542b608` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-a0647255-3602-4032-a4d9-d982322292b8` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-11b8b2cf-d4e2-41aa-b661-a5e28a414021` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-28842403-7018-4ac2-859f-287e304bb1da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28842403-7018-4ac2-859f-287e304bb1da
Content-Type: application/json

--- request body ---
{"handle":"qa-d61b0a303073","displayName":"QA d61b0a303073","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-28842403-7018-4ac2-859f-287e304bb1da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-d61b0a303073
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e59c9b6b-05d0-4f11-9158-4c62f603725e","handle":"qa-d61b0a303073","displayName":"QA d61b0a303073","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.274530770Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-506675f5-98a8-4cb6-8ba8-7159d4cab7f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506675f5-98a8-4cb6-8ba8-7159d4cab7f7
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d4f048e80d","displayName":"QA c4d4f048e80d","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-506675f5-98a8-4cb6-8ba8-7159d4cab7f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Location: /v1/accounts/qa-c4d4f048e80d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da5abbf3-d520-48c6-b9d6-d679ecfc4630","handle":"qa-c4d4f048e80d","displayName":"QA c4d4f048e80d","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.309557796Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5d3490ae-aa22-449f-8f8c-c2d489cfd700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d3490ae-aa22-449f-8f8c-c2d489cfd700
Content-Type: application/json

--- request body ---
{"handle":"qa-d61b0a303073","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d3490ae-aa22-449f-8f8c-c2d489cfd700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e59c9b6b-05d0-4f11-9158-4c62f603725e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8b6837b6-29b8-41b6-9261-9088722acee7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b6837b6-29b8-41b6-9261-9088722acee7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c4d4f048e80d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b6837b6-29b8-41b6-9261-9088722acee7
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
Location: /v1/conversations/cnv_27655014-0e8f-48f2-8da8-e7460d92de46
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_27655014-0e8f-48f2-8da8-e7460d92de46","subject":"Error contract","status":"open","region":"eu","participants":["qa-d61b0a303073","qa-c4d4f048e80d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.369062291Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_27655014-0e8f-48f2-8da8-e7460d92de46/messages
correlation: qa-f6cd71af-7dbf-4101-b112-98c2301c8bbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6cd71af-7dbf-4101-b112-98c2301c8bbe
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f6cd71af-7dbf-4101-b112-98c2301c8bbe
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_27655014-0e8f-48f2-8da8-e7460d92de46/messages","correlationId":"qa-f6cd71af-7dbf-4101-b112-98c2301c8bbe","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8578bf4-fe25-4853-9009-ad277a1a7c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8578bf4-fe25-4853-9009-ad277a1a7c73
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d4f048e80d","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8578bf4-fe25-4853-9009-ad277a1a7c73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da5abbf3-d520-48c6-b9d6-d679ecfc4630"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b52bec9b-4120-4f5f-aa35-606eb7655f5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b52bec9b-4120-4f5f-aa35-606eb7655f5e
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b52bec9b-4120-4f5f-aa35-606eb7655f5e
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
correlation: qa-2aaa6253-eb10-458f-b4d3-e81bb542b608

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aaa6253-eb10-458f-b4d3-e81bb542b608
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d4f048e80d","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2aaa6253-eb10-458f-b4d3-e81bb542b608
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2aaa6253-eb10-458f-b4d3-e81bb542b608"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a0647255-3602-4032-a4d9-d982322292b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0647255-3602-4032-a4d9-d982322292b8
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a0647255-3602-4032-a4d9-d982322292b8
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
correlation: qa-11b8b2cf-d4e2-41aa-b661-a5e28a414021

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11b8b2cf-d4e2-41aa-b661-a5e28a414021
Content-Type: application/json

--- request body ---
{"handle":"qa-d61b0a303073","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-11b8b2cf-d4e2-41aa-b661-a5e28a414021
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-11b8b2cf-d4e2-41aa-b661-a5e28a414021"}
```
