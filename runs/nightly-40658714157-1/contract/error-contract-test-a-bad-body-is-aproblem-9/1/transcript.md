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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-c8ce72bd-99be-4181-b51b-03a925ecd8f1` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-109783d7-34e3-4860-9555-d3096f0b5f8b` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-9bef6fb7-5779-42c1-b4ad-75df949d1382` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-e327029a-a9ab-4a67-9327-9c77c0c868f3` |
| 5 | `POST /v1/conversations` | 400 | 4 | `qa-9cd66676-cbad-432e-b013-8e11a38f8a41` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-be2eabc3-a7c6-4207-a447-2d71848650fb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-35f3e275-af3e-4016-aeb9-e83fb558c325` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-b0a033f9-bf8c-4901-a930-105c11b5b0a2` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-4644b356-9b91-4bd2-9f91-e805e2796d48` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-d27f260e-d9a9-4cad-b4d6-8d82a96af9d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8ce72bd-99be-4181-b51b-03a925ecd8f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ce72bd-99be-4181-b51b-03a925ecd8f1
Content-Type: application/json

--- request body ---
{"handle":"qa-48f1d6d36baa","displayName":"QA 48f1d6d36baa","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ce72bd-99be-4181-b51b-03a925ecd8f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-48f1d6d36baa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e3be9125-ab90-48f0-a136-f7a643e1d027","handle":"qa-48f1d6d36baa","displayName":"QA 48f1d6d36baa","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.676616459Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-109783d7-34e3-4860-9555-d3096f0b5f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109783d7-34e3-4860-9555-d3096f0b5f8b
Content-Type: application/json

--- request body ---
{"handle":"qa-c8e623575b9b","displayName":"QA c8e623575b9b","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-109783d7-34e3-4860-9555-d3096f0b5f8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-c8e623575b9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65f2414f-bc7b-4964-ab02-01256cfa9d97","handle":"qa-c8e623575b9b","displayName":"QA c8e623575b9b","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.714288204Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9bef6fb7-5779-42c1-b4ad-75df949d1382

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bef6fb7-5779-42c1-b4ad-75df949d1382
Content-Type: application/json

--- request body ---
{"handle":"qa-48f1d6d36baa","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bef6fb7-5779-42c1-b4ad-75df949d1382
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e3be9125-ab90-48f0-a136-f7a643e1d027"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e327029a-a9ab-4a67-9327-9c77c0c868f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e327029a-a9ab-4a67-9327-9c77c0c868f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c8e623575b9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e327029a-a9ab-4a67-9327-9c77c0c868f3
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
Location: /v1/conversations/cnv_2dbdfb0c-4a64-4fbc-aeff-f3b20a7682e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2dbdfb0c-4a64-4fbc-aeff-f3b20a7682e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-48f1d6d36baa","qa-c8e623575b9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.784515969Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9cd66676-cbad-432e-b013-8e11a38f8a41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cd66676-cbad-432e-b013-8e11a38f8a41
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9cd66676-cbad-432e-b013-8e11a38f8a41
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-9cd66676-cbad-432e-b013-8e11a38f8a41"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-be2eabc3-a7c6-4207-a447-2d71848650fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be2eabc3-a7c6-4207-a447-2d71848650fb
Content-Type: application/json

--- request body ---
{"handle":"qa-c8e623575b9b","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-be2eabc3-a7c6-4207-a447-2d71848650fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65f2414f-bc7b-4964-ab02-01256cfa9d97"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35f3e275-af3e-4016-aeb9-e83fb558c325

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35f3e275-af3e-4016-aeb9-e83fb558c325
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35f3e275-af3e-4016-aeb9-e83fb558c325
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
correlation: qa-b0a033f9-bf8c-4901-a930-105c11b5b0a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0a033f9-bf8c-4901-a930-105c11b5b0a2
Content-Type: application/json

--- request body ---
{"handle":"qa-c8e623575b9b","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b0a033f9-bf8c-4901-a930-105c11b5b0a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b0a033f9-bf8c-4901-a930-105c11b5b0a2"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4644b356-9b91-4bd2-9f91-e805e2796d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4644b356-9b91-4bd2-9f91-e805e2796d48
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4644b356-9b91-4bd2-9f91-e805e2796d48
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
correlation: qa-d27f260e-d9a9-4cad-b4d6-8d82a96af9d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d27f260e-d9a9-4cad-b4d6-8d82a96af9d9
Content-Type: application/json

--- request body ---
{"handle":"qa-48f1d6d36baa","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d27f260e-d9a9-4cad-b4d6-8d82a96af9d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d27f260e-d9a9-4cad-b4d6-8d82a96af9d9"}
```
