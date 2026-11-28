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
| 1 | `POST /v1/accounts` | 201 | 62 | `qa-86cadea8-7adc-4494-b977-52007e309c4e` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-10ffb335-46ba-4928-a629-039b5b84e010` |
| 3 | `POST /v1/auth/token` | 200 | 45 | `qa-8a2b9876-e42f-4a14-bbd1-ec108f04e062` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-0228bf33-ea31-4184-919d-d06e06ca3cbb` |
| 5 | `POST /v1/auth/token` | 400 | 17 | `qa-35f57725-380b-4574-b64b-d82e9c0b8400` |
| 6 | `POST /v1/auth/token` | 200 | 54 | `qa-33ab2735-54bf-48b8-a825-88122eaf25cc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-a8540e48-4aa7-4a1d-ad9d-7014c25fd69e` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-842a0153-7bde-415c-820f-037af363d8e8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fc5c7668-01be-454a-94b6-7bc401a5c8f9` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-0ec226f3-8a82-4486-8e4b-25352eb0c5ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-86cadea8-7adc-4494-b977-52007e309c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86cadea8-7adc-4494-b977-52007e309c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-f6c4440e53e7","displayName":"QA f6c4440e53e7","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-86cadea8-7adc-4494-b977-52007e309c4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-f6c4440e53e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08ef05a9-288b-4303-bf51-246101773d69","handle":"qa-f6c4440e53e7","displayName":"QA f6c4440e53e7","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.005480266Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-10ffb335-46ba-4928-a629-039b5b84e010

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ffb335-46ba-4928-a629-039b5b84e010
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebcaaa9cabf","displayName":"QA 3ebcaaa9cabf","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ffb335-46ba-4928-a629-039b5b84e010
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Location: /v1/accounts/qa-3ebcaaa9cabf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f9fafb2a-52f0-4977-8255-458d29cc5501","handle":"qa-3ebcaaa9cabf","displayName":"QA 3ebcaaa9cabf","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.089975058Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8a2b9876-e42f-4a14-bbd1-ec108f04e062

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a2b9876-e42f-4a14-bbd1-ec108f04e062
Content-Type: application/json

--- request body ---
{"handle":"qa-f6c4440e53e7","password":"****"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a2b9876-e42f-4a14-bbd1-ec108f04e062
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08ef05a9-288b-4303-bf51-246101773d69"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0228bf33-ea31-4184-919d-d06e06ca3cbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0228bf33-ea31-4184-919d-d06e06ca3cbb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3ebcaaa9cabf","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0228bf33-ea31-4184-919d-d06e06ca3cbb
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
Location: /v1/conversations/cnv_ad011061-b5ba-42a2-af87-6f94f10f7472
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad011061-b5ba-42a2-af87-6f94f10f7472","subject":"Error contract","status":"open","region":"eu","participants":["qa-f6c4440e53e7","qa-3ebcaaa9cabf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.182131202Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-35f57725-380b-4574-b64b-d82e9c0b8400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f57725-380b-4574-b64b-d82e9c0b8400
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35f57725-380b-4574-b64b-d82e9c0b8400
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-35f57725-380b-4574-b64b-d82e9c0b8400"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-33ab2735-54bf-48b8-a825-88122eaf25cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ab2735-54bf-48b8-a825-88122eaf25cc
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebcaaa9cabf","password":"****"}

--- response: 200 in 54 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-33ab2735-54bf-48b8-a825-88122eaf25cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f9fafb2a-52f0-4977-8255-458d29cc5501"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a8540e48-4aa7-4a1d-ad9d-7014c25fd69e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8540e48-4aa7-4a1d-ad9d-7014c25fd69e
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a8540e48-4aa7-4a1d-ad9d-7014c25fd69e
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
correlation: qa-842a0153-7bde-415c-820f-037af363d8e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-842a0153-7bde-415c-820f-037af363d8e8
Content-Type: application/json

--- request body ---
{"handle":"qa-3ebcaaa9cabf","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-842a0153-7bde-415c-820f-037af363d8e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-842a0153-7bde-415c-820f-037af363d8e8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc5c7668-01be-454a-94b6-7bc401a5c8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5c7668-01be-454a-94b6-7bc401a5c8f9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc5c7668-01be-454a-94b6-7bc401a5c8f9
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
correlation: qa-0ec226f3-8a82-4486-8e4b-25352eb0c5ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec226f3-8a82-4486-8e4b-25352eb0c5ea
Content-Type: application/json

--- request body ---
{"handle":"qa-f6c4440e53e7","password":"****"}

--- response: 401 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ec226f3-8a82-4486-8e4b-25352eb0c5ea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ec226f3-8a82-4486-8e4b-25352eb0c5ea"}
```
