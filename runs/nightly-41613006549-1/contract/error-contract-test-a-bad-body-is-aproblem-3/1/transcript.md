# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 374 | `qa-34e0d4bc-f844-4b9f-9e35-618d0a4955e4` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-861f9ae0-be1d-4f18-a60c-9967a9ae53a6` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-4ac245bc-7e76-42a4-830f-fccc3921da51` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-453e657f-3c11-4021-beb3-ecc9ac27a0b4` |
| 5 | `POST /v1/accounts` | 400 | 13 | `qa-a0b762e9-0f51-4621-a951-3ee4974853cb` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-140df075-acc0-4638-a1be-7db6d686bd67` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-8ac01f93-30c2-462c-b2af-1d89c660d860` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-7fd52aaf-cc92-4d99-8a3a-072ff6e90010` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-a88f96ac-b65b-46e0-8f1b-1d9f6ba8f8f7` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-c7c64c71-069f-4995-91fb-bfa2b87e905f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-34e0d4bc-f844-4b9f-9e35-618d0a4955e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34e0d4bc-f844-4b9f-9e35-618d0a4955e4
Content-Type: application/json

--- request body ---
{"handle":"qa-69bbcb106560","displayName":"QA 69bbcb106560","password":"****","region":"eu"}

--- response: 201 in 374 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-34e0d4bc-f844-4b9f-9e35-618d0a4955e4
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
Location: /v1/accounts/qa-69bbcb106560
X-Served-Region: eu
Content-Length: 181

{"id":"acc_399c30c9-e4c5-49d8-b590-14f299666cf5","handle":"qa-69bbcb106560","displayName":"QA 69bbcb106560","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.847077052Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-861f9ae0-be1d-4f18-a60c-9967a9ae53a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-861f9ae0-be1d-4f18-a60c-9967a9ae53a6
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc0214e4e87","displayName":"QA 0dc0214e4e87","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-861f9ae0-be1d-4f18-a60c-9967a9ae53a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-0dc0214e4e87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_265b7ea8-e49a-4671-bea4-83866472adcd","handle":"qa-0dc0214e4e87","displayName":"QA 0dc0214e4e87","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.217825987Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4ac245bc-7e76-42a4-830f-fccc3921da51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ac245bc-7e76-42a4-830f-fccc3921da51
Content-Type: application/json

--- request body ---
{"handle":"qa-69bbcb106560","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ac245bc-7e76-42a4-830f-fccc3921da51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_399c30c9-e4c5-49d8-b590-14f299666cf5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-453e657f-3c11-4021-beb3-ecc9ac27a0b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-453e657f-3c11-4021-beb3-ecc9ac27a0b4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0dc0214e4e87","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-453e657f-3c11-4021-beb3-ecc9ac27a0b4
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
Location: /v1/conversations/cnv_a3272a89-1a33-46a1-9119-9503630d3152
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a3272a89-1a33-46a1-9119-9503630d3152","subject":"Error contract","status":"open","region":"eu","participants":["qa-69bbcb106560","qa-0dc0214e4e87"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.403197378Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-a0b762e9-0f51-4621-a951-3ee4974853cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0b762e9-0f51-4621-a951-3ee4974853cb
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0b762e9-0f51-4621-a951-3ee4974853cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-a0b762e9-0f51-4621-a951-3ee4974853cb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-140df075-acc0-4638-a1be-7db6d686bd67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-140df075-acc0-4638-a1be-7db6d686bd67
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc0214e4e87","password":"****"}

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-140df075-acc0-4638-a1be-7db6d686bd67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_265b7ea8-e49a-4671-bea4-83866472adcd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ac01f93-30c2-462c-b2af-1d89c660d860

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ac01f93-30c2-462c-b2af-1d89c660d860
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ac01f93-30c2-462c-b2af-1d89c660d860
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
correlation: qa-7fd52aaf-cc92-4d99-8a3a-072ff6e90010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd52aaf-cc92-4d99-8a3a-072ff6e90010
Content-Type: application/json

--- request body ---
{"handle":"qa-0dc0214e4e87","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fd52aaf-cc92-4d99-8a3a-072ff6e90010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fd52aaf-cc92-4d99-8a3a-072ff6e90010"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a88f96ac-b65b-46e0-8f1b-1d9f6ba8f8f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a88f96ac-b65b-46e0-8f1b-1d9f6ba8f8f7
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a88f96ac-b65b-46e0-8f1b-1d9f6ba8f8f7
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c7c64c71-069f-4995-91fb-bfa2b87e905f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7c64c71-069f-4995-91fb-bfa2b87e905f
Content-Type: application/json

--- request body ---
{"handle":"qa-69bbcb106560","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7c64c71-069f-4995-91fb-bfa2b87e905f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7c64c71-069f-4995-91fb-bfa2b87e905f"}
```
