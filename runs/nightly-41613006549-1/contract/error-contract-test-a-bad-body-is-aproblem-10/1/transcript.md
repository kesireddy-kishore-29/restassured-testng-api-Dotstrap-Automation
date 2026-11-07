# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-057fb4e2-08e4-4613-aec7-76e31586e612` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-d9986c31-17fc-43cf-b47d-a9714690b23e` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-5c92ae27-807e-4143-87ea-f5c1e06d5cfc` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-962d2fb1-3e71-4637-89f8-7f4b19dd52e6` |
| 5 | `POST /v1/conversations` | 415 | 31 | `qa-4cc871a4-eae3-489f-8ff6-8388eba9bd3f` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-e3df9b9c-4e57-430e-8093-54f7337036a6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-5b52b6b3-a42d-4239-b6e9-0739bd8878b2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-e4167916-0761-401a-9645-6ca1e49354b4` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2fd728be-7309-4e80-b9af-a4fc45ba8ad5` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-69c0fe2c-e900-4227-a68e-305cac575447` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-057fb4e2-08e4-4613-aec7-76e31586e612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-057fb4e2-08e4-4613-aec7-76e31586e612
Content-Type: application/json

--- request body ---
{"handle":"qa-58a2e967cdd0","displayName":"QA 58a2e967cdd0","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-057fb4e2-08e4-4613-aec7-76e31586e612
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 9
Location: /v1/accounts/qa-58a2e967cdd0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f4c1d86f-82aa-4ed0-84e7-a76568be45b7","handle":"qa-58a2e967cdd0","displayName":"QA 58a2e967cdd0","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.750423886Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9986c31-17fc-43cf-b47d-a9714690b23e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9986c31-17fc-43cf-b47d-a9714690b23e
Content-Type: application/json

--- request body ---
{"handle":"qa-907f1c9bd5d3","displayName":"QA 907f1c9bd5d3","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9986c31-17fc-43cf-b47d-a9714690b23e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 9
Location: /v1/accounts/qa-907f1c9bd5d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e47d8c27-f911-4344-8fc3-2b4681e64117","handle":"qa-907f1c9bd5d3","displayName":"QA 907f1c9bd5d3","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.781719332Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5c92ae27-807e-4143-87ea-f5c1e06d5cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c92ae27-807e-4143-87ea-f5c1e06d5cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-58a2e967cdd0","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c92ae27-807e-4143-87ea-f5c1e06d5cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f4c1d86f-82aa-4ed0-84e7-a76568be45b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-962d2fb1-3e71-4637-89f8-7f4b19dd52e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-962d2fb1-3e71-4637-89f8-7f4b19dd52e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-907f1c9bd5d3","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-962d2fb1-3e71-4637-89f8-7f4b19dd52e6
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
Location: /v1/conversations/cnv_4969e509-1232-4b17-b1cf-3f3f37fb38e8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4969e509-1232-4b17-b1cf-3f3f37fb38e8","subject":"Error contract","status":"open","region":"eu","participants":["qa-58a2e967cdd0","qa-907f1c9bd5d3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.842938618Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-4cc871a4-eae3-489f-8ff6-8388eba9bd3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc871a4-eae3-489f-8ff6-8388eba9bd3f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cc871a4-eae3-489f-8ff6-8388eba9bd3f
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-4cc871a4-eae3-489f-8ff6-8388eba9bd3f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e3df9b9c-4e57-430e-8093-54f7337036a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3df9b9c-4e57-430e-8093-54f7337036a6
Content-Type: application/json

--- request body ---
{"handle":"qa-907f1c9bd5d3","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3df9b9c-4e57-430e-8093-54f7337036a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e47d8c27-f911-4344-8fc3-2b4681e64117"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b52b6b3-a42d-4239-b6e9-0739bd8878b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b52b6b3-a42d-4239-b6e9-0739bd8878b2
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b52b6b3-a42d-4239-b6e9-0739bd8878b2
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
correlation: qa-e4167916-0761-401a-9645-6ca1e49354b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4167916-0761-401a-9645-6ca1e49354b4
Content-Type: application/json

--- request body ---
{"handle":"qa-907f1c9bd5d3","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4167916-0761-401a-9645-6ca1e49354b4
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4167916-0761-401a-9645-6ca1e49354b4"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fd728be-7309-4e80-b9af-a4fc45ba8ad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd728be-7309-4e80-b9af-a4fc45ba8ad5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fd728be-7309-4e80-b9af-a4fc45ba8ad5
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
correlation: qa-69c0fe2c-e900-4227-a68e-305cac575447

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c0fe2c-e900-4227-a68e-305cac575447
Content-Type: application/json

--- request body ---
{"handle":"qa-58a2e967cdd0","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69c0fe2c-e900-4227-a68e-305cac575447
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-69c0fe2c-e900-4227-a68e-305cac575447"}
```
