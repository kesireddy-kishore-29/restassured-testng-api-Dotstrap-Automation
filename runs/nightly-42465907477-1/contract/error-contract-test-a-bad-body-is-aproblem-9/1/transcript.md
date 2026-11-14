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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-bb6044d4-634a-4c28-904f-585fea7cca58` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-9828e7bf-6a4c-456e-a377-3b800fd67ec1` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-d3da4fe7-ecd9-4bea-8d40-30b7cd1308c8` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-34c9b7bd-a10f-40c4-8895-9a9349f83821` |
| 5 | `POST /v1/conversations` | 400 | 5 | `qa-33a5e27b-6b8a-4332-ac81-1b23a2e512a5` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-ef83b5b3-18af-4201-9071-5d33888958d0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-38458f50-97c2-4fd3-99c8-ab03165341eb` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-1bda3b37-4ae3-46b0-abca-54c5a42d0b21` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ced1ca17-e090-4b5a-bb85-87594e47d561` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-632b9ca5-4c20-48e1-871f-3b31215f4f50` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb6044d4-634a-4c28-904f-585fea7cca58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb6044d4-634a-4c28-904f-585fea7cca58
Content-Type: application/json

--- request body ---
{"handle":"qa-8ee957d100f0","displayName":"QA 8ee957d100f0","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb6044d4-634a-4c28-904f-585fea7cca58
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
Location: /v1/accounts/qa-8ee957d100f0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2be2307b-155f-4564-85e2-286fe620383b","handle":"qa-8ee957d100f0","displayName":"QA 8ee957d100f0","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.014979374Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9828e7bf-6a4c-456e-a377-3b800fd67ec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9828e7bf-6a4c-456e-a377-3b800fd67ec1
Content-Type: application/json

--- request body ---
{"handle":"qa-21b91c246baa","displayName":"QA 21b91c246baa","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9828e7bf-6a4c-456e-a377-3b800fd67ec1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Location: /v1/accounts/qa-21b91c246baa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1acb18ed-2aea-4f41-9816-061e0289e81f","handle":"qa-21b91c246baa","displayName":"QA 21b91c246baa","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.045406494Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3da4fe7-ecd9-4bea-8d40-30b7cd1308c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3da4fe7-ecd9-4bea-8d40-30b7cd1308c8
Content-Type: application/json

--- request body ---
{"handle":"qa-8ee957d100f0","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3da4fe7-ecd9-4bea-8d40-30b7cd1308c8
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2be2307b-155f-4564-85e2-286fe620383b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-34c9b7bd-a10f-40c4-8895-9a9349f83821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c9b7bd-a10f-40c4-8895-9a9349f83821
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-21b91c246baa","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-34c9b7bd-a10f-40c4-8895-9a9349f83821
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
Location: /v1/conversations/cnv_b7e90954-92c8-4490-aac0-355fb056bcf5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b7e90954-92c8-4490-aac0-355fb056bcf5","subject":"Error contract","status":"open","region":"eu","participants":["qa-8ee957d100f0","qa-21b91c246baa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.116239233Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-33a5e27b-6b8a-4332-ac81-1b23a2e512a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33a5e27b-6b8a-4332-ac81-1b23a2e512a5
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33a5e27b-6b8a-4332-ac81-1b23a2e512a5
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-33a5e27b-6b8a-4332-ac81-1b23a2e512a5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ef83b5b3-18af-4201-9071-5d33888958d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef83b5b3-18af-4201-9071-5d33888958d0
Content-Type: application/json

--- request body ---
{"handle":"qa-21b91c246baa","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef83b5b3-18af-4201-9071-5d33888958d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1acb18ed-2aea-4f41-9816-061e0289e81f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-38458f50-97c2-4fd3-99c8-ab03165341eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38458f50-97c2-4fd3-99c8-ab03165341eb
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-38458f50-97c2-4fd3-99c8-ab03165341eb
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
correlation: qa-1bda3b37-4ae3-46b0-abca-54c5a42d0b21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bda3b37-4ae3-46b0-abca-54c5a42d0b21
Content-Type: application/json

--- request body ---
{"handle":"qa-21b91c246baa","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1bda3b37-4ae3-46b0-abca-54c5a42d0b21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1bda3b37-4ae3-46b0-abca-54c5a42d0b21"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ced1ca17-e090-4b5a-bb85-87594e47d561

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ced1ca17-e090-4b5a-bb85-87594e47d561
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ced1ca17-e090-4b5a-bb85-87594e47d561
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
correlation: qa-632b9ca5-4c20-48e1-871f-3b31215f4f50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-632b9ca5-4c20-48e1-871f-3b31215f4f50
Content-Type: application/json

--- request body ---
{"handle":"qa-8ee957d100f0","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-632b9ca5-4c20-48e1-871f-3b31215f4f50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-632b9ca5-4c20-48e1-871f-3b31215f4f50"}
```
