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
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-2953fe13-c241-4364-aa93-8717558482c8` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-a8f4d1e8-4ad1-4f55-becb-38979cae026f` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-3ecf070b-8b41-46c8-a266-48719df367b0` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-9758c7df-626d-4c1d-825c-ef1fca9b5234` |
| 5 | `POST /v1/accounts` | 400 | 31 | `qa-ad6a1dd8-8b24-4e23-a1d5-d7c349a114ad` |
| 6 | `POST /v1/auth/token` | 200 | 85 | `qa-8dfbaf69-a64c-4384-a8bc-b8c09fe2cf47` |
| 7 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-c3be1142-8195-46d6-898c-cb18878081e2` |
| 8 | `POST /v1/auth/token` | 401 | 41 | `qa-0db629a1-4147-4fb0-9730-dde688d5deb2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c4c621fd-2a57-46ed-b064-53f5195dd29b` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-0455d0ec-6e5d-4afc-91fe-66ff785deb0d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2953fe13-c241-4364-aa93-8717558482c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2953fe13-c241-4364-aa93-8717558482c8
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f148994693","displayName":"QA e6f148994693","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2953fe13-c241-4364-aa93-8717558482c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-e6f148994693
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5511ad2a-61bb-49f1-bca0-58ba50d46ce0","handle":"qa-e6f148994693","displayName":"QA e6f148994693","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.636873799Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a8f4d1e8-4ad1-4f55-becb-38979cae026f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8f4d1e8-4ad1-4f55-becb-38979cae026f
Content-Type: application/json

--- request body ---
{"handle":"qa-014f77f1a2a1","displayName":"QA 014f77f1a2a1","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8f4d1e8-4ad1-4f55-becb-38979cae026f
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
Location: /v1/accounts/qa-014f77f1a2a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_17e60294-e66d-4e41-88da-14a977d5aef4","handle":"qa-014f77f1a2a1","displayName":"QA 014f77f1a2a1","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.668215011Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3ecf070b-8b41-46c8-a266-48719df367b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ecf070b-8b41-46c8-a266-48719df367b0
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f148994693","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ecf070b-8b41-46c8-a266-48719df367b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5511ad2a-61bb-49f1-bca0-58ba50d46ce0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9758c7df-626d-4c1d-825c-ef1fca9b5234

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9758c7df-626d-4c1d-825c-ef1fca9b5234
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-014f77f1a2a1","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9758c7df-626d-4c1d-825c-ef1fca9b5234
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
Location: /v1/conversations/cnv_033f3912-5560-47f8-8e73-adf79c650446
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_033f3912-5560-47f8-8e73-adf79c650446","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6f148994693","qa-014f77f1a2a1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.719759046Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-ad6a1dd8-8b24-4e23-a1d5-d7c349a114ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6a1dd8-8b24-4e23-a1d5-d7c349a114ad
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad6a1dd8-8b24-4e23-a1d5-d7c349a114ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-ad6a1dd8-8b24-4e23-a1d5-d7c349a114ad"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8dfbaf69-a64c-4384-a8bc-b8c09fe2cf47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dfbaf69-a64c-4384-a8bc-b8c09fe2cf47
Content-Type: application/json

--- request body ---
{"handle":"qa-014f77f1a2a1","password":"****"}

--- response: 200 in 85 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dfbaf69-a64c-4384-a8bc-b8c09fe2cf47
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17e60294-e66d-4e41-88da-14a977d5aef4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3be1142-8195-46d6-898c-cb18878081e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3be1142-8195-46d6-898c-cb18878081e2
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3be1142-8195-46d6-898c-cb18878081e2
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
correlation: qa-0db629a1-4147-4fb0-9730-dde688d5deb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0db629a1-4147-4fb0-9730-dde688d5deb2
Content-Type: application/json

--- request body ---
{"handle":"qa-014f77f1a2a1","password":"****"}

--- response: 401 in 41 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0db629a1-4147-4fb0-9730-dde688d5deb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0db629a1-4147-4fb0-9730-dde688d5deb2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4c621fd-2a57-46ed-b064-53f5195dd29b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c621fd-2a57-46ed-b064-53f5195dd29b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4c621fd-2a57-46ed-b064-53f5195dd29b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0455d0ec-6e5d-4afc-91fe-66ff785deb0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0455d0ec-6e5d-4afc-91fe-66ff785deb0d
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f148994693","password":"****"}

--- response: 401 in 22 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0455d0ec-6e5d-4afc-91fe-66ff785deb0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0455d0ec-6e5d-4afc-91fe-66ff785deb0d"}
```
