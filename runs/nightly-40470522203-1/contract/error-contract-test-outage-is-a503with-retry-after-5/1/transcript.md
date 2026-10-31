# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-b588f33f-5457-4273-8b5c-e39b4b42f168` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-29d55121-1c3b-4c53-b21e-e8938958e618` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-447f919f-093b-4a44-b5e3-facf0ec553a4` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-c73294c5-2fef-418f-ae16-8414c2d15914` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 20 | `qa-4f807b25-4987-46d0-9d57-770b5fb60a6b` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-3328e900-e136-4313-bb5b-d01429ad112e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-77374518-0492-4989-b61b-6eaa4f4312f0` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-253615b9-f3e0-4f12-99d8-753f13287719` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-5939e0f6-7d95-45c4-864a-cd8c05f04ebe` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-a242ced3-6369-4703-9052-875c4c58f115` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b588f33f-5457-4273-8b5c-e39b4b42f168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b588f33f-5457-4273-8b5c-e39b4b42f168
Content-Type: application/json

--- request body ---
{"handle":"qa-ea4d8d367d4c","displayName":"QA ea4d8d367d4c","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b588f33f-5457-4273-8b5c-e39b4b42f168
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
Location: /v1/accounts/qa-ea4d8d367d4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af746871-4cad-4c95-8f2e-5af6b2f18d77","handle":"qa-ea4d8d367d4c","displayName":"QA ea4d8d367d4c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.195228760Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-29d55121-1c3b-4c53-b21e-e8938958e618

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29d55121-1c3b-4c53-b21e-e8938958e618
Content-Type: application/json

--- request body ---
{"handle":"qa-2642f1ea6b57","displayName":"QA 2642f1ea6b57","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-29d55121-1c3b-4c53-b21e-e8938958e618
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Location: /v1/accounts/qa-2642f1ea6b57
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0bb2f906-810d-4e59-a1ad-c5cf2af63ed7","handle":"qa-2642f1ea6b57","displayName":"QA 2642f1ea6b57","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.255816726Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-447f919f-093b-4a44-b5e3-facf0ec553a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-447f919f-093b-4a44-b5e3-facf0ec553a4
Content-Type: application/json

--- request body ---
{"handle":"qa-ea4d8d367d4c","password":"****"}

--- response: 200 in 43 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-447f919f-093b-4a44-b5e3-facf0ec553a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af746871-4cad-4c95-8f2e-5af6b2f18d77"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c73294c5-2fef-418f-ae16-8414c2d15914

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c73294c5-2fef-418f-ae16-8414c2d15914
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2642f1ea6b57","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c73294c5-2fef-418f-ae16-8414c2d15914
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
Location: /v1/conversations/cnv_a4fb50d4-5312-4891-b4f1-09b437e54a0c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4fb50d4-5312-4891-b4f1-09b437e54a0c","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea4d8d367d4c","qa-2642f1ea6b57"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.360099316Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-ea4d8d367d4c
correlation: qa-4f807b25-4987-46d0-9d57-770b5fb60a6b

--- request headers ---
Accept: application/json
X-Fault-Key: 70dcf0f5-00a7-4164-802d-07157b14805f
X-Fault: unavailable-once
X-Correlation-Id: qa-4f807b25-4987-46d0-9d57-770b5fb60a6b
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f807b25-4987-46d0-9d57-770b5fb60a6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-ea4d8d367d4c","correlationId":"qa-4f807b25-4987-46d0-9d57-770b5fb60a6b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3328e900-e136-4313-bb5b-d01429ad112e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3328e900-e136-4313-bb5b-d01429ad112e
Content-Type: application/json

--- request body ---
{"handle":"qa-2642f1ea6b57","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-3328e900-e136-4313-bb5b-d01429ad112e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0bb2f906-810d-4e59-a1ad-c5cf2af63ed7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77374518-0492-4989-b61b-6eaa4f4312f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77374518-0492-4989-b61b-6eaa4f4312f0
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77374518-0492-4989-b61b-6eaa4f4312f0
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
correlation: qa-253615b9-f3e0-4f12-99d8-753f13287719

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-253615b9-f3e0-4f12-99d8-753f13287719
Content-Type: application/json

--- request body ---
{"handle":"qa-2642f1ea6b57","password":"****"}

--- response: 401 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-253615b9-f3e0-4f12-99d8-753f13287719
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-253615b9-f3e0-4f12-99d8-753f13287719"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5939e0f6-7d95-45c4-864a-cd8c05f04ebe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5939e0f6-7d95-45c4-864a-cd8c05f04ebe
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5939e0f6-7d95-45c4-864a-cd8c05f04ebe
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
correlation: qa-a242ced3-6369-4703-9052-875c4c58f115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a242ced3-6369-4703-9052-875c4c58f115
Content-Type: application/json

--- request body ---
{"handle":"qa-ea4d8d367d4c","password":"****"}

--- response: 401 in 17 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a242ced3-6369-4703-9052-875c4c58f115
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a242ced3-6369-4703-9052-875c4c58f115"}
```
