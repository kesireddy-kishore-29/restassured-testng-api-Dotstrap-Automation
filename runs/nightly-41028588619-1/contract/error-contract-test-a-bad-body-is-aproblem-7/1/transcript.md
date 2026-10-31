# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 70 | `qa-41dc8210-9a74-4054-8bf0-70e327e77674` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-3c3587b3-f9ec-4bdb-8805-5130146ab246` |
| 3 | `POST /v1/auth/token` | 200 | 52 | `qa-2a1e2ffe-9da9-4043-8960-f5d5099e587c` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-86134115-0d57-4ac8-a285-05bd990d001b` |
| 5 | `PATCH /v1/accounts/me` | 415 | 56 | `qa-d4065b2d-b14e-4f83-b342-de3ea61cf99c` |
| 6 | `POST /v1/auth/token` | 200 | 94 | `qa-9ed7cb3a-60df-41cc-b6ac-b379df740ca7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-710474c8-7e81-464b-a065-3cc453b359b3` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-71f0e4ca-5843-4888-8e01-aaa03e9bc57b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-aa0c2733-fb02-4065-aa42-6f4a78ea1053` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-f3376696-234f-4323-8255-16f442db5ff6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41dc8210-9a74-4054-8bf0-70e327e77674

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41dc8210-9a74-4054-8bf0-70e327e77674
Content-Type: application/json

--- request body ---
{"handle":"qa-51db26dfbfee","displayName":"QA 51db26dfbfee","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-41dc8210-9a74-4054-8bf0-70e327e77674
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Location: /v1/accounts/qa-51db26dfbfee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_919be4c6-4630-4321-9bf9-96c76d12a84e","handle":"qa-51db26dfbfee","displayName":"QA 51db26dfbfee","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.815906056Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c3587b3-f9ec-4bdb-8805-5130146ab246

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c3587b3-f9ec-4bdb-8805-5130146ab246
Content-Type: application/json

--- request body ---
{"handle":"qa-8746022bede5","displayName":"QA 8746022bede5","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c3587b3-f9ec-4bdb-8805-5130146ab246
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Location: /v1/accounts/qa-8746022bede5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fb8934f-f7a8-4fbb-b21e-1ca05921d2af","handle":"qa-8746022bede5","displayName":"QA 8746022bede5","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.900339510Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2a1e2ffe-9da9-4043-8960-f5d5099e587c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a1e2ffe-9da9-4043-8960-f5d5099e587c
Content-Type: application/json

--- request body ---
{"handle":"qa-51db26dfbfee","password":"****"}

--- response: 200 in 52 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a1e2ffe-9da9-4043-8960-f5d5099e587c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_919be4c6-4630-4321-9bf9-96c76d12a84e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-86134115-0d57-4ac8-a285-05bd990d001b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86134115-0d57-4ac8-a285-05bd990d001b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8746022bede5","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-86134115-0d57-4ac8-a285-05bd990d001b
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
Location: /v1/conversations/cnv_ad37e986-2694-4ebc-875d-eb5883ea30c8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad37e986-2694-4ebc-875d-eb5883ea30c8","subject":"Error contract","status":"open","region":"eu","participants":["qa-51db26dfbfee","qa-8746022bede5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.027258652Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d4065b2d-b14e-4f83-b342-de3ea61cf99c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4065b2d-b14e-4f83-b342-de3ea61cf99c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 56 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4065b2d-b14e-4f83-b342-de3ea61cf99c
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-d4065b2d-b14e-4f83-b342-de3ea61cf99c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9ed7cb3a-60df-41cc-b6ac-b379df740ca7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ed7cb3a-60df-41cc-b6ac-b379df740ca7
Content-Type: application/json

--- request body ---
{"handle":"qa-8746022bede5","password":"****"}

--- response: 200 in 94 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ed7cb3a-60df-41cc-b6ac-b379df740ca7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fb8934f-f7a8-4fbb-b21e-1ca05921d2af"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-710474c8-7e81-464b-a065-3cc453b359b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-710474c8-7e81-464b-a065-3cc453b359b3
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-710474c8-7e81-464b-a065-3cc453b359b3
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
correlation: qa-71f0e4ca-5843-4888-8e01-aaa03e9bc57b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f0e4ca-5843-4888-8e01-aaa03e9bc57b
Content-Type: application/json

--- request body ---
{"handle":"qa-8746022bede5","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71f0e4ca-5843-4888-8e01-aaa03e9bc57b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71f0e4ca-5843-4888-8e01-aaa03e9bc57b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa0c2733-fb02-4065-aa42-6f4a78ea1053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa0c2733-fb02-4065-aa42-6f4a78ea1053
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa0c2733-fb02-4065-aa42-6f4a78ea1053
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
correlation: qa-f3376696-234f-4323-8255-16f442db5ff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3376696-234f-4323-8255-16f442db5ff6
Content-Type: application/json

--- request body ---
{"handle":"qa-51db26dfbfee","password":"****"}

--- response: 401 in 36 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3376696-234f-4323-8255-16f442db5ff6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3376696-234f-4323-8255-16f442db5ff6"}
```
