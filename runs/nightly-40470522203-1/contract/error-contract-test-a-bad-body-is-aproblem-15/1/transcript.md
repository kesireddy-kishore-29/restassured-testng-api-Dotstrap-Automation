# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[15]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-adb80390-cad5-428d-93bf-d0ab944e97e4` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-22998bed-07d3-4269-bcb8-72a9736b17ae` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-5efe94dd-779e-4788-aedf-25dfc9b6ace1` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-d9f86832-f3fe-4e04-9875-abe949676d26` |
| 5 | `POST /v1/credits/purchases` | 400 | 19 | `qa-be66ba2f-ab9c-4647-b162-adc8276854de` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-41b508a1-8fd9-4384-a903-85ae9c7af944` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-31fc905c-139f-460c-a84f-7d9a1aa9fe49` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-02596446-6706-4cb4-bbe3-d8595a5cf251` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-412a92f5-f1b3-47bb-a426-20565ad6c356` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-d8f3d8b1-e91f-43f1-aa75-ca5153be7c97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-adb80390-cad5-428d-93bf-d0ab944e97e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adb80390-cad5-428d-93bf-d0ab944e97e4
Content-Type: application/json

--- request body ---
{"handle":"qa-2a6f8ea0b0b0","displayName":"QA 2a6f8ea0b0b0","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-adb80390-cad5-428d-93bf-d0ab944e97e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Location: /v1/accounts/qa-2a6f8ea0b0b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_66b81b66-d6fd-443d-8abf-14a08039e793","handle":"qa-2a6f8ea0b0b0","displayName":"QA 2a6f8ea0b0b0","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.397837560Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22998bed-07d3-4269-bcb8-72a9736b17ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22998bed-07d3-4269-bcb8-72a9736b17ae
Content-Type: application/json

--- request body ---
{"handle":"qa-bddbce8c05b7","displayName":"QA bddbce8c05b7","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-22998bed-07d3-4269-bcb8-72a9736b17ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 6
Location: /v1/accounts/qa-bddbce8c05b7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d127ef85-077a-439a-86ec-15c2fff38273","handle":"qa-bddbce8c05b7","displayName":"QA bddbce8c05b7","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.453937364Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5efe94dd-779e-4788-aedf-25dfc9b6ace1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5efe94dd-779e-4788-aedf-25dfc9b6ace1
Content-Type: application/json

--- request body ---
{"handle":"qa-2a6f8ea0b0b0","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5efe94dd-779e-4788-aedf-25dfc9b6ace1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_66b81b66-d6fd-443d-8abf-14a08039e793"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d9f86832-f3fe-4e04-9875-abe949676d26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9f86832-f3fe-4e04-9875-abe949676d26
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bddbce8c05b7","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9f86832-f3fe-4e04-9875-abe949676d26
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
Location: /v1/conversations/cnv_911b0b0f-fbf6-414f-aeea-abd033b56cc4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_911b0b0f-fbf6-414f-aeea-abd033b56cc4","subject":"Error contract","status":"open","region":"eu","participants":["qa-2a6f8ea0b0b0","qa-bddbce8c05b7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.562681932Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-be66ba2f-ab9c-4647-b162-adc8276854de

--- request headers ---
Accept: application/json
Idempotency-Key: qa-dda3d36676e248bea9902e896ccbb28b
X-Correlation-Id: qa-be66ba2f-ab9c-4647-b162-adc8276854de
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be66ba2f-ab9c-4647-b162-adc8276854de
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
Content-Length: 262

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/credits/purchases","correlationId":"qa-be66ba2f-ab9c-4647-b162-adc8276854de"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-41b508a1-8fd9-4384-a903-85ae9c7af944

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41b508a1-8fd9-4384-a903-85ae9c7af944
Content-Type: application/json

--- request body ---
{"handle":"qa-bddbce8c05b7","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-41b508a1-8fd9-4384-a903-85ae9c7af944
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d127ef85-077a-439a-86ec-15c2fff38273"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31fc905c-139f-460c-a84f-7d9a1aa9fe49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31fc905c-139f-460c-a84f-7d9a1aa9fe49
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31fc905c-139f-460c-a84f-7d9a1aa9fe49
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
correlation: qa-02596446-6706-4cb4-bbe3-d8595a5cf251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02596446-6706-4cb4-bbe3-d8595a5cf251
Content-Type: application/json

--- request body ---
{"handle":"qa-bddbce8c05b7","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-02596446-6706-4cb4-bbe3-d8595a5cf251
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-02596446-6706-4cb4-bbe3-d8595a5cf251"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-412a92f5-f1b3-47bb-a426-20565ad6c356

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412a92f5-f1b3-47bb-a426-20565ad6c356
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-412a92f5-f1b3-47bb-a426-20565ad6c356
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
correlation: qa-d8f3d8b1-e91f-43f1-aa75-ca5153be7c97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f3d8b1-e91f-43f1-aa75-ca5153be7c97
Content-Type: application/json

--- request body ---
{"handle":"qa-2a6f8ea0b0b0","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8f3d8b1-e91f-43f1-aa75-ca5153be7c97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8f3d8b1-e91f-43f1-aa75-ca5153be7c97"}
```
