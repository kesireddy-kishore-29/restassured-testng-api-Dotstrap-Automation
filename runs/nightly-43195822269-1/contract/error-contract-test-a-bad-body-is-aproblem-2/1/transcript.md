# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-6e94679b-4996-423b-a35c-6b040f791051` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-b6ac101d-9e03-4795-8b1b-6753dcae2e71` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-6e13223b-2a6c-4257-a3f8-a15ed438ed0d` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-58318ee0-acab-49da-9435-2fc616bbfb6f` |
| 5 | `POST /v1/auth/token` | 422 | 48 | `qa-f2ca1d61-5cc4-48cc-b5da-f31b0949aa1f` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-bb0fe6c4-1100-41b2-8401-df57530c0d0d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-d709f1a9-779f-4728-9c15-aa1a9c399573` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-0e72c64d-8500-436a-bc68-e22973fbab37` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-c10c5d14-6aff-4c2b-9d41-3f1cbbbc2a16` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-9afafcd0-83e0-4b42-b11a-bf3f74a70255` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e94679b-4996-423b-a35c-6b040f791051

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e94679b-4996-423b-a35c-6b040f791051
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a0e06bb82c","displayName":"QA d9a0e06bb82c","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e94679b-4996-423b-a35c-6b040f791051
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-d9a0e06bb82c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3c3924df-8ad5-494b-ad87-c9dee33d83ad","handle":"qa-d9a0e06bb82c","displayName":"QA d9a0e06bb82c","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.050213693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b6ac101d-9e03-4795-8b1b-6753dcae2e71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6ac101d-9e03-4795-8b1b-6753dcae2e71
Content-Type: application/json

--- request body ---
{"handle":"qa-aad7af8d2e49","displayName":"QA aad7af8d2e49","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6ac101d-9e03-4795-8b1b-6753dcae2e71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-aad7af8d2e49
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fdf19d6-932d-45e0-9c70-2fae4b782ec2","handle":"qa-aad7af8d2e49","displayName":"QA aad7af8d2e49","region":"eu","role":"user","createdAt":"2026-11-12T09:56:30.090552189Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6e13223b-2a6c-4257-a3f8-a15ed438ed0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e13223b-2a6c-4257-a3f8-a15ed438ed0d
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a0e06bb82c","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e13223b-2a6c-4257-a3f8-a15ed438ed0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3c3924df-8ad5-494b-ad87-c9dee33d83ad"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-58318ee0-acab-49da-9435-2fc616bbfb6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58318ee0-acab-49da-9435-2fc616bbfb6f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aad7af8d2e49","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-58318ee0-acab-49da-9435-2fc616bbfb6f
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
Location: /v1/conversations/cnv_1fbeff60-1107-4156-9651-54e6ea413a41
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1fbeff60-1107-4156-9651-54e6ea413a41","subject":"Error contract","status":"open","region":"eu","participants":["qa-d9a0e06bb82c","qa-aad7af8d2e49"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:30.150732832Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f2ca1d61-5cc4-48cc-b5da-f31b0949aa1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2ca1d61-5cc4-48cc-b5da-f31b0949aa1f
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a0e06bb82c","password":"****","ttlSeconds":0}

--- response: 422 in 48 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2ca1d61-5cc4-48cc-b5da-f31b0949aa1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-f2ca1d61-5cc4-48cc-b5da-f31b0949aa1f","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb0fe6c4-1100-41b2-8401-df57530c0d0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb0fe6c4-1100-41b2-8401-df57530c0d0d
Content-Type: application/json

--- request body ---
{"handle":"qa-aad7af8d2e49","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb0fe6c4-1100-41b2-8401-df57530c0d0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fdf19d6-932d-45e0-9c70-2fae4b782ec2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d709f1a9-779f-4728-9c15-aa1a9c399573

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d709f1a9-779f-4728-9c15-aa1a9c399573
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d709f1a9-779f-4728-9c15-aa1a9c399573
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
correlation: qa-0e72c64d-8500-436a-bc68-e22973fbab37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e72c64d-8500-436a-bc68-e22973fbab37
Content-Type: application/json

--- request body ---
{"handle":"qa-aad7af8d2e49","password":"****"}

--- response: 401 in 25 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e72c64d-8500-436a-bc68-e22973fbab37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e72c64d-8500-436a-bc68-e22973fbab37"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c10c5d14-6aff-4c2b-9d41-3f1cbbbc2a16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c10c5d14-6aff-4c2b-9d41-3f1cbbbc2a16
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c10c5d14-6aff-4c2b-9d41-3f1cbbbc2a16
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
correlation: qa-9afafcd0-83e0-4b42-b11a-bf3f74a70255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9afafcd0-83e0-4b42-b11a-bf3f74a70255
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a0e06bb82c","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9afafcd0-83e0-4b42-b11a-bf3f74a70255
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9afafcd0-83e0-4b42-b11a-bf3f74a70255"}
```
