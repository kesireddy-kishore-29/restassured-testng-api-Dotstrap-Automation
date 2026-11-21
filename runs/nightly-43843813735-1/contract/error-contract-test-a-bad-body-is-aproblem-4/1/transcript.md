# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-64224892-8945-49d1-989e-f1d700ef65d5` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-4cdd7e7a-7207-4a5f-8809-666cd3a8a7cf` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-c76c9be4-ffa4-4742-8ab5-4280c1b811c1` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-789ad135-0ed2-41d3-86de-fc6e0b8d00dc` |
| 5 | `POST /v1/accounts` | 415 | 12 | `qa-2f707550-f149-4bbb-9982-e6706df28928` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-ad44ea9a-6541-4747-a6fa-04d788b8368c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 50 | `qa-6b69a02f-68fe-44c5-8186-829e7bf8f6d4` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-0e2a4799-0b16-4f24-9fd5-f21cba0c435e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-18c40811-2d28-4546-94e8-9ae34fd2ebbe` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-fb009fb6-aeb3-43de-8381-cae81c982251` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-64224892-8945-49d1-989e-f1d700ef65d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64224892-8945-49d1-989e-f1d700ef65d5
Content-Type: application/json

--- request body ---
{"handle":"qa-998069d11603","displayName":"QA 998069d11603","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-64224892-8945-49d1-989e-f1d700ef65d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-998069d11603
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7832ca23-dc86-48fd-ad83-fcd5133197f1","handle":"qa-998069d11603","displayName":"QA 998069d11603","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.145298463Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4cdd7e7a-7207-4a5f-8809-666cd3a8a7cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cdd7e7a-7207-4a5f-8809-666cd3a8a7cf
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd30f8531b4","displayName":"QA 1cd30f8531b4","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cdd7e7a-7207-4a5f-8809-666cd3a8a7cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 470
RateLimit-Reset: 8
Location: /v1/accounts/qa-1cd30f8531b4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0cc2bd96-558a-451a-8faa-00f1ef489598","handle":"qa-1cd30f8531b4","displayName":"QA 1cd30f8531b4","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.208837199Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c76c9be4-ffa4-4742-8ab5-4280c1b811c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c76c9be4-ffa4-4742-8ab5-4280c1b811c1
Content-Type: application/json

--- request body ---
{"handle":"qa-998069d11603","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c76c9be4-ffa4-4742-8ab5-4280c1b811c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7832ca23-dc86-48fd-ad83-fcd5133197f1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-789ad135-0ed2-41d3-86de-fc6e0b8d00dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-789ad135-0ed2-41d3-86de-fc6e0b8d00dc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1cd30f8531b4","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-789ad135-0ed2-41d3-86de-fc6e0b8d00dc
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
Location: /v1/conversations/cnv_32f2e47d-9d40-40a2-bbc9-d793d85b968b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_32f2e47d-9d40-40a2-bbc9-d793d85b968b","subject":"Error contract","status":"open","region":"eu","participants":["qa-998069d11603","qa-1cd30f8531b4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.272473161Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-2f707550-f149-4bbb-9982-e6706df28928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f707550-f149-4bbb-9982-e6706df28928
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f707550-f149-4bbb-9982-e6706df28928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-2f707550-f149-4bbb-9982-e6706df28928"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ad44ea9a-6541-4747-a6fa-04d788b8368c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad44ea9a-6541-4747-a6fa-04d788b8368c
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd30f8531b4","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad44ea9a-6541-4747-a6fa-04d788b8368c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0cc2bd96-558a-451a-8faa-00f1ef489598"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6b69a02f-68fe-44c5-8186-829e7bf8f6d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b69a02f-68fe-44c5-8186-829e7bf8f6d4
Content-Type: application/json

--- response: 204 in 50 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6b69a02f-68fe-44c5-8186-829e7bf8f6d4
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
correlation: qa-0e2a4799-0b16-4f24-9fd5-f21cba0c435e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2a4799-0b16-4f24-9fd5-f21cba0c435e
Content-Type: application/json

--- request body ---
{"handle":"qa-1cd30f8531b4","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e2a4799-0b16-4f24-9fd5-f21cba0c435e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e2a4799-0b16-4f24-9fd5-f21cba0c435e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18c40811-2d28-4546-94e8-9ae34fd2ebbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18c40811-2d28-4546-94e8-9ae34fd2ebbe
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18c40811-2d28-4546-94e8-9ae34fd2ebbe
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
correlation: qa-fb009fb6-aeb3-43de-8381-cae81c982251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb009fb6-aeb3-43de-8381-cae81c982251
Content-Type: application/json

--- request body ---
{"handle":"qa-998069d11603","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fb009fb6-aeb3-43de-8381-cae81c982251
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fb009fb6-aeb3-43de-8381-cae81c982251"}
```
