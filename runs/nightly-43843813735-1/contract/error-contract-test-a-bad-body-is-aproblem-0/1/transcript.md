# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-73ffb1cd-f8d4-4109-8414-0bfd197a03f9` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-d9bf4828-3eac-4c9f-836a-a70d47d8bcd2` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-83554df4-1201-4ea2-8b94-8fc62e8d4424` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-9958cf8e-1bb6-46b8-9b8c-afd63d5562be` |
| 5 | `POST /v1/auth/token` | 400 | 24 | `qa-66bf6501-296e-40d3-9c2a-787974ed4b19` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-37125c8e-ec55-4609-b40c-e4346f2c27b1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-171163d3-13b7-4f68-b5b5-8b26f3770a67` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-0f8c6ef6-f636-4f3a-86b6-5af11db42bca` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-590214be-4e69-4a1c-9b13-6c5e44053f54` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-0331df91-73ab-461d-af66-4df18a76fbfa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-73ffb1cd-f8d4-4109-8414-0bfd197a03f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73ffb1cd-f8d4-4109-8414-0bfd197a03f9
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcd2f829b9c","displayName":"QA 5dcd2f829b9c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-73ffb1cd-f8d4-4109-8414-0bfd197a03f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-5dcd2f829b9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff20dad3-6bff-4f46-afd7-34c69908ab86","handle":"qa-5dcd2f829b9c","displayName":"QA 5dcd2f829b9c","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.896331311Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9bf4828-3eac-4c9f-836a-a70d47d8bcd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9bf4828-3eac-4c9f-836a-a70d47d8bcd2
Content-Type: application/json

--- request body ---
{"handle":"qa-738229b3e2cd","displayName":"QA 738229b3e2cd","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9bf4828-3eac-4c9f-836a-a70d47d8bcd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-738229b3e2cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_591a7cf2-f25c-4ff4-8086-8383c3058e48","handle":"qa-738229b3e2cd","displayName":"QA 738229b3e2cd","region":"eu","role":"user","createdAt":"2026-11-16T09:53:51.920101561Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-83554df4-1201-4ea2-8b94-8fc62e8d4424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83554df4-1201-4ea2-8b94-8fc62e8d4424
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcd2f829b9c","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-83554df4-1201-4ea2-8b94-8fc62e8d4424
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff20dad3-6bff-4f46-afd7-34c69908ab86"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9958cf8e-1bb6-46b8-9b8c-afd63d5562be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9958cf8e-1bb6-46b8-9b8c-afd63d5562be
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-738229b3e2cd","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-9958cf8e-1bb6-46b8-9b8c-afd63d5562be
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
Location: /v1/conversations/cnv_b599412d-b609-46b2-9da9-f972ddafcede
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b599412d-b609-46b2-9da9-f972ddafcede","subject":"Error contract","status":"open","region":"eu","participants":["qa-5dcd2f829b9c","qa-738229b3e2cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:51.976976804Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-66bf6501-296e-40d3-9c2a-787974ed4b19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66bf6501-296e-40d3-9c2a-787974ed4b19
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66bf6501-296e-40d3-9c2a-787974ed4b19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-66bf6501-296e-40d3-9c2a-787974ed4b19"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-37125c8e-ec55-4609-b40c-e4346f2c27b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37125c8e-ec55-4609-b40c-e4346f2c27b1
Content-Type: application/json

--- request body ---
{"handle":"qa-738229b3e2cd","password":"****"}

--- response: 200 in 54 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-37125c8e-ec55-4609-b40c-e4346f2c27b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_591a7cf2-f25c-4ff4-8086-8383c3058e48"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-171163d3-13b7-4f68-b5b5-8b26f3770a67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-171163d3-13b7-4f68-b5b5-8b26f3770a67
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-171163d3-13b7-4f68-b5b5-8b26f3770a67
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
correlation: qa-0f8c6ef6-f636-4f3a-86b6-5af11db42bca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f8c6ef6-f636-4f3a-86b6-5af11db42bca
Content-Type: application/json

--- request body ---
{"handle":"qa-738229b3e2cd","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f8c6ef6-f636-4f3a-86b6-5af11db42bca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f8c6ef6-f636-4f3a-86b6-5af11db42bca"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-590214be-4e69-4a1c-9b13-6c5e44053f54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-590214be-4e69-4a1c-9b13-6c5e44053f54
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-590214be-4e69-4a1c-9b13-6c5e44053f54
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
correlation: qa-0331df91-73ab-461d-af66-4df18a76fbfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0331df91-73ab-461d-af66-4df18a76fbfa
Content-Type: application/json

--- request body ---
{"handle":"qa-5dcd2f829b9c","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0331df91-73ab-461d-af66-4df18a76fbfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0331df91-73ab-461d-af66-4df18a76fbfa"}
```
