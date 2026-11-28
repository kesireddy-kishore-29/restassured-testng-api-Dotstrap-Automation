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
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-127d86ea-ac09-4e65-b150-0b998bd47a1a` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-5b249edd-4398-4a1a-90d9-affbae3efead` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-b215a689-7142-440a-9156-d1d1e4fdd8e7` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-08bb5d10-bb82-4ede-a4f6-0188682b8802` |
| 5 | `PATCH /v1/accounts/me` | 415 | 17 | `qa-d24dd4d1-ba99-4c1f-80ac-f4ab391887b1` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-0678f31b-bb3b-43bc-a6af-a131682ab3fc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-97a1818b-2eb5-4696-be3d-ddbae3a56024` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-96fd76fe-2006-4ecc-bbc0-99d4f7242caa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-492db21c-46fa-4665-97a6-aea285d2ae42` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-50dd2086-3025-4769-a13b-471e9a9c233e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-127d86ea-ac09-4e65-b150-0b998bd47a1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-127d86ea-ac09-4e65-b150-0b998bd47a1a
Content-Type: application/json

--- request body ---
{"handle":"qa-5b542b381e9d","displayName":"QA 5b542b381e9d","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-127d86ea-ac09-4e65-b150-0b998bd47a1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 7
Location: /v1/accounts/qa-5b542b381e9d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abb46c36-ef6c-4718-bf8a-190c6606e697","handle":"qa-5b542b381e9d","displayName":"QA 5b542b381e9d","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.486171113Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5b249edd-4398-4a1a-90d9-affbae3efead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b249edd-4398-4a1a-90d9-affbae3efead
Content-Type: application/json

--- request body ---
{"handle":"qa-60c49433e34d","displayName":"QA 60c49433e34d","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b249edd-4398-4a1a-90d9-affbae3efead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 7
Location: /v1/accounts/qa-60c49433e34d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_984ebf3f-cbf0-454b-8870-56714dff792f","handle":"qa-60c49433e34d","displayName":"QA 60c49433e34d","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.546690381Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b215a689-7142-440a-9156-d1d1e4fdd8e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b215a689-7142-440a-9156-d1d1e4fdd8e7
Content-Type: application/json

--- request body ---
{"handle":"qa-5b542b381e9d","password":"****"}

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b215a689-7142-440a-9156-d1d1e4fdd8e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abb46c36-ef6c-4718-bf8a-190c6606e697"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-08bb5d10-bb82-4ede-a4f6-0188682b8802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08bb5d10-bb82-4ede-a4f6-0188682b8802
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-60c49433e34d","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-08bb5d10-bb82-4ede-a4f6-0188682b8802
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
Location: /v1/conversations/cnv_c9db4eb5-eea9-4bbe-babf-86ec606ed233
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c9db4eb5-eea9-4bbe-babf-86ec606ed233","subject":"Error contract","status":"open","region":"eu","participants":["qa-5b542b381e9d","qa-60c49433e34d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.616232198Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d24dd4d1-ba99-4c1f-80ac-f4ab391887b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d24dd4d1-ba99-4c1f-80ac-f4ab391887b1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d24dd4d1-ba99-4c1f-80ac-f4ab391887b1
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-d24dd4d1-ba99-4c1f-80ac-f4ab391887b1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0678f31b-bb3b-43bc-a6af-a131682ab3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0678f31b-bb3b-43bc-a6af-a131682ab3fc
Content-Type: application/json

--- request body ---
{"handle":"qa-60c49433e34d","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-0678f31b-bb3b-43bc-a6af-a131682ab3fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_984ebf3f-cbf0-454b-8870-56714dff792f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-97a1818b-2eb5-4696-be3d-ddbae3a56024

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97a1818b-2eb5-4696-be3d-ddbae3a56024
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-97a1818b-2eb5-4696-be3d-ddbae3a56024
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
correlation: qa-96fd76fe-2006-4ecc-bbc0-99d4f7242caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96fd76fe-2006-4ecc-bbc0-99d4f7242caa
Content-Type: application/json

--- request body ---
{"handle":"qa-60c49433e34d","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96fd76fe-2006-4ecc-bbc0-99d4f7242caa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-96fd76fe-2006-4ecc-bbc0-99d4f7242caa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-492db21c-46fa-4665-97a6-aea285d2ae42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-492db21c-46fa-4665-97a6-aea285d2ae42
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-492db21c-46fa-4665-97a6-aea285d2ae42
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
correlation: qa-50dd2086-3025-4769-a13b-471e9a9c233e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50dd2086-3025-4769-a13b-471e9a9c233e
Content-Type: application/json

--- request body ---
{"handle":"qa-5b542b381e9d","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-50dd2086-3025-4769-a13b-471e9a9c233e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-50dd2086-3025-4769-a13b-471e9a9c233e"}
```
