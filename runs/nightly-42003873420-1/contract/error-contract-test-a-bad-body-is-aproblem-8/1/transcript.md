# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-210c9a2f-2e1a-4c44-9e9a-daf8e47cb257` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-13811aa3-463d-4c45-afe4-480b869d1988` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-a0bb3f1d-05f5-49b1-ac33-80c921262dcb` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-6660d0b3-c694-44be-881c-d4d6834e878c` |
| 5 | `PATCH /v1/accounts/me` | 422 | 27 | `qa-d1df5558-34f3-4637-97d2-1ae94a5d721a` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-37514b06-e37c-4054-a703-a48099399348` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-2747a26c-4fab-4cae-9899-5b3f425f1297` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-32e71905-0149-4780-a3e9-42bc1c6d0b0f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a55627ab-2d50-48ad-81d2-20a6afea60ac` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-da0498ff-b00c-4809-8f96-e6326742c3c8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-210c9a2f-2e1a-4c44-9e9a-daf8e47cb257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-210c9a2f-2e1a-4c44-9e9a-daf8e47cb257
Content-Type: application/json

--- request body ---
{"handle":"qa-c056d473779b","displayName":"QA c056d473779b","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-210c9a2f-2e1a-4c44-9e9a-daf8e47cb257
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Location: /v1/accounts/qa-c056d473779b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f96aa621-b163-4fa0-b418-6d2751f888a2","handle":"qa-c056d473779b","displayName":"QA c056d473779b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.121736144Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-13811aa3-463d-4c45-afe4-480b869d1988

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13811aa3-463d-4c45-afe4-480b869d1988
Content-Type: application/json

--- request body ---
{"handle":"qa-e4c01dda1e4a","displayName":"QA e4c01dda1e4a","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-13811aa3-463d-4c45-afe4-480b869d1988
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Location: /v1/accounts/qa-e4c01dda1e4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38301f24-1982-4ec4-b1f8-944817a3ff7e","handle":"qa-e4c01dda1e4a","displayName":"QA e4c01dda1e4a","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.207003471Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a0bb3f1d-05f5-49b1-ac33-80c921262dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0bb3f1d-05f5-49b1-ac33-80c921262dcb
Content-Type: application/json

--- request body ---
{"handle":"qa-c056d473779b","password":"****"}

--- response: 200 in 38 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0bb3f1d-05f5-49b1-ac33-80c921262dcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f96aa621-b163-4fa0-b418-6d2751f888a2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6660d0b3-c694-44be-881c-d4d6834e878c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6660d0b3-c694-44be-881c-d4d6834e878c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4c01dda1e4a","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6660d0b3-c694-44be-881c-d4d6834e878c
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
Location: /v1/conversations/cnv_5dbafb82-cb36-40e0-a096-0c0dc0159b48
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5dbafb82-cb36-40e0-a096-0c0dc0159b48","subject":"Error contract","status":"open","region":"eu","participants":["qa-c056d473779b","qa-e4c01dda1e4a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.291055403Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d1df5558-34f3-4637-97d2-1ae94a5d721a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1df5558-34f3-4637-97d2-1ae94a5d721a
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 27 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1df5558-34f3-4637-97d2-1ae94a5d721a
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-d1df5558-34f3-4637-97d2-1ae94a5d721a","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-37514b06-e37c-4054-a703-a48099399348

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37514b06-e37c-4054-a703-a48099399348
Content-Type: application/json

--- request body ---
{"handle":"qa-e4c01dda1e4a","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-37514b06-e37c-4054-a703-a48099399348
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38301f24-1982-4ec4-b1f8-944817a3ff7e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2747a26c-4fab-4cae-9899-5b3f425f1297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2747a26c-4fab-4cae-9899-5b3f425f1297
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2747a26c-4fab-4cae-9899-5b3f425f1297
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
correlation: qa-32e71905-0149-4780-a3e9-42bc1c6d0b0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32e71905-0149-4780-a3e9-42bc1c6d0b0f
Content-Type: application/json

--- request body ---
{"handle":"qa-e4c01dda1e4a","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32e71905-0149-4780-a3e9-42bc1c6d0b0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32e71905-0149-4780-a3e9-42bc1c6d0b0f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a55627ab-2d50-48ad-81d2-20a6afea60ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a55627ab-2d50-48ad-81d2-20a6afea60ac
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a55627ab-2d50-48ad-81d2-20a6afea60ac
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
correlation: qa-da0498ff-b00c-4809-8f96-e6326742c3c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da0498ff-b00c-4809-8f96-e6326742c3c8
Content-Type: application/json

--- request body ---
{"handle":"qa-c056d473779b","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-da0498ff-b00c-4809-8f96-e6326742c3c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-da0498ff-b00c-4809-8f96-e6326742c3c8"}
```
