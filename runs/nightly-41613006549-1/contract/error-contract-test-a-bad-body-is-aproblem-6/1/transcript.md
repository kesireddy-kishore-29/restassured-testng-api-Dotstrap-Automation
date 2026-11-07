# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-0438c7b7-837b-4dbb-a666-18719c0481ce` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-80a325e1-f0f9-499e-a76a-022aa09c2ab0` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-4677764b-9f39-4a47-acbc-210da3c63f21` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-66b58e94-0647-4790-a3f1-a976ecefab37` |
| 5 | `PATCH /v1/accounts/me` | 400 | 17 | `qa-716ce5c2-e26a-48e6-9ae5-c399e80b06e6` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-9e469a63-6362-476f-91e1-cbddf31a469c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-9987708f-e67e-4dc3-a90e-de7e5463475b` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-294efa7c-8f9a-4ffd-a0bb-fe92e413bfa1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-06d02181-4a54-4566-8699-e0f7420047e9` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-60a7b6a6-74ae-4157-8ac9-7e758c840c52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0438c7b7-837b-4dbb-a666-18719c0481ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0438c7b7-837b-4dbb-a666-18719c0481ce
Content-Type: application/json

--- request body ---
{"handle":"qa-893356299bdd","displayName":"QA 893356299bdd","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0438c7b7-837b-4dbb-a666-18719c0481ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Location: /v1/accounts/qa-893356299bdd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ed75edb-072d-41a3-a577-4f67248f51c4","handle":"qa-893356299bdd","displayName":"QA 893356299bdd","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.344365127Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-80a325e1-f0f9-499e-a76a-022aa09c2ab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80a325e1-f0f9-499e-a76a-022aa09c2ab0
Content-Type: application/json

--- request body ---
{"handle":"qa-34cfb875db85","displayName":"QA 34cfb875db85","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-80a325e1-f0f9-499e-a76a-022aa09c2ab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 489
RateLimit-Reset: 9
Location: /v1/accounts/qa-34cfb875db85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8f356636-1019-4fba-a953-603d20b20094","handle":"qa-34cfb875db85","displayName":"QA 34cfb875db85","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.385306388Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4677764b-9f39-4a47-acbc-210da3c63f21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4677764b-9f39-4a47-acbc-210da3c63f21
Content-Type: application/json

--- request body ---
{"handle":"qa-893356299bdd","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-4677764b-9f39-4a47-acbc-210da3c63f21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ed75edb-072d-41a3-a577-4f67248f51c4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66b58e94-0647-4790-a3f1-a976ecefab37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b58e94-0647-4790-a3f1-a976ecefab37
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-34cfb875db85","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-66b58e94-0647-4790-a3f1-a976ecefab37
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
Location: /v1/conversations/cnv_d6fd05f5-3b08-41fa-a058-e7f1a7061fc8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d6fd05f5-3b08-41fa-a058-e7f1a7061fc8","subject":"Error contract","status":"open","region":"eu","participants":["qa-893356299bdd","qa-34cfb875db85"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.467050861Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-716ce5c2-e26a-48e6-9ae5-c399e80b06e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-716ce5c2-e26a-48e6-9ae5-c399e80b06e6
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-716ce5c2-e26a-48e6-9ae5-c399e80b06e6
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-716ce5c2-e26a-48e6-9ae5-c399e80b06e6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9e469a63-6362-476f-91e1-cbddf31a469c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e469a63-6362-476f-91e1-cbddf31a469c
Content-Type: application/json

--- request body ---
{"handle":"qa-34cfb875db85","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e469a63-6362-476f-91e1-cbddf31a469c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8f356636-1019-4fba-a953-603d20b20094"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9987708f-e67e-4dc3-a90e-de7e5463475b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9987708f-e67e-4dc3-a90e-de7e5463475b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9987708f-e67e-4dc3-a90e-de7e5463475b
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
correlation: qa-294efa7c-8f9a-4ffd-a0bb-fe92e413bfa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-294efa7c-8f9a-4ffd-a0bb-fe92e413bfa1
Content-Type: application/json

--- request body ---
{"handle":"qa-34cfb875db85","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-294efa7c-8f9a-4ffd-a0bb-fe92e413bfa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-294efa7c-8f9a-4ffd-a0bb-fe92e413bfa1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-06d02181-4a54-4566-8699-e0f7420047e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06d02181-4a54-4566-8699-e0f7420047e9
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-06d02181-4a54-4566-8699-e0f7420047e9
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
correlation: qa-60a7b6a6-74ae-4157-8ac9-7e758c840c52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60a7b6a6-74ae-4157-8ac9-7e758c840c52
Content-Type: application/json

--- request body ---
{"handle":"qa-893356299bdd","password":"****"}

--- response: 401 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60a7b6a6-74ae-4157-8ac9-7e758c840c52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60a7b6a6-74ae-4157-8ac9-7e758c840c52"}
```
