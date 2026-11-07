# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 309 | `qa-706d7f4b-3706-4ba0-90d5-ae42b5fdffdd` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-c650a927-656c-4108-a849-fd918bea5039` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-4132f23f-e17f-429c-b0ca-b7a58ee1ec6f` |
| 4 | `POST /v1/conversations` | 201 | 52 | `qa-a9fc21bc-2492-41f2-9abd-25ee8358a6bd` |
| 5 | `POST /v1/auth/token` | 200 | 29 | `qa-66104dfb-af2f-47ca-9f0c-e46d2c8af28c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 26 | `qa-86bf5884-0cea-464a-ac5e-1dca84ca4558` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 32 | `qa-6ebe3306-6dc0-4381-8d2d-425b27d6c881` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-b162151c-ca20-41e7-a51f-608be2ef4777` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-8a7a3f83-5f7c-41b1-ab20-e93fecdf8ffe` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-abac3d28-95cd-4044-8089-443f0ddacc0e` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-47e8987f-03e1-4bd1-a9ae-c4647e0778b2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-706d7f4b-3706-4ba0-90d5-ae42b5fdffdd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-706d7f4b-3706-4ba0-90d5-ae42b5fdffdd
Content-Type: application/json

--- request body ---
{"handle":"qa-2ffd5c56d349","displayName":"QA 2ffd5c56d349","password":"****","region":"eu"}

--- response: 201 in 309 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-706d7f4b-3706-4ba0-90d5-ae42b5fdffdd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-2ffd5c56d349
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72e15d9a-371a-4029-97e8-4fd10a251b2a","handle":"qa-2ffd5c56d349","displayName":"QA 2ffd5c56d349","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.596872035Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c650a927-656c-4108-a849-fd918bea5039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c650a927-656c-4108-a849-fd918bea5039
Content-Type: application/json

--- request body ---
{"handle":"qa-dba04b462315","displayName":"QA dba04b462315","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c650a927-656c-4108-a849-fd918bea5039
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-dba04b462315
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc3e4fe0-fdca-43ea-8e96-7807a2d1d73e","handle":"qa-dba04b462315","displayName":"QA dba04b462315","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.945925537Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4132f23f-e17f-429c-b0ca-b7a58ee1ec6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4132f23f-e17f-429c-b0ca-b7a58ee1ec6f
Content-Type: application/json

--- request body ---
{"handle":"qa-2ffd5c56d349","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-4132f23f-e17f-429c-b0ca-b7a58ee1ec6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72e15d9a-371a-4029-97e8-4fd10a251b2a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9fc21bc-2492-41f2-9abd-25ee8358a6bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9fc21bc-2492-41f2-9abd-25ee8358a6bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dba04b462315","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 52 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9fc21bc-2492-41f2-9abd-25ee8358a6bd
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
Location: /v1/conversations/cnv_4fcba5f5-22ca-4909-9301-e088feb504bc
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_4fcba5f5-22ca-4909-9301-e088feb504bc","subject":"Lunch?","status":"open","region":"eu","participants":["qa-2ffd5c56d349","qa-dba04b462315"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.054093571Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-66104dfb-af2f-47ca-9f0c-e46d2c8af28c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66104dfb-af2f-47ca-9f0c-e46d2c8af28c
Content-Type: application/json

--- request body ---
{"handle":"qa-dba04b462315","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-66104dfb-af2f-47ca-9f0c-e46d2c8af28c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc3e4fe0-fdca-43ea-8e96-7807a2d1d73e"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_4fcba5f5-22ca-4909-9301-e088feb504bc/messages
correlation: qa-86bf5884-0cea-464a-ac5e-1dca84ca4558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86bf5884-0cea-464a-ac5e-1dca84ca4558
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-86bf5884-0cea-464a-ac5e-1dca84ca4558
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
Content-Length: 203

{"id":"msg_9f1f24b4-69ab-4a96-a8b1-e65cd14ee7bf","conversationId":"cnv_4fcba5f5-22ca-4909-9301-e088feb504bc","sender":"qa-dba04b462315","body":"Friday works","createdAt":"2026-11-07T08:54:57.195990492Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4fcba5f5-22ca-4909-9301-e088feb504bc/messages
correlation: qa-6ebe3306-6dc0-4381-8d2d-425b27d6c881

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ebe3306-6dc0-4381-8d2d-425b27d6c881
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ebe3306-6dc0-4381-8d2d-425b27d6c881
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
Content-Length: 432

{"items":[{"id":"msg_a376c86a-ba89-4b0b-86c4-31640f35c9de","conversationId":"cnv_4fcba5f5-22ca-4909-9301-e088feb504bc","sender":"qa-2ffd5c56d349","body":"Free on Friday?","createdAt":"2026-11-07T08:54:57.054276296Z"},{"id":"msg_9f1f24b4-69ab-4a96-a8b1-e65cd14ee7bf","conversationId":"cnv_4fcba5f5-22ca-4909-9301-e088feb504bc","sender":"qa-dba04b462315","body":"Friday works","createdAt":"2026-11-07T08:54:57.195990492Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b162151c-ca20-41e7-a51f-608be2ef4777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b162151c-ca20-41e7-a51f-608be2ef4777
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b162151c-ca20-41e7-a51f-608be2ef4777
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8a7a3f83-5f7c-41b1-ab20-e93fecdf8ffe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a7a3f83-5f7c-41b1-ab20-e93fecdf8ffe
Content-Type: application/json

--- request body ---
{"handle":"qa-dba04b462315","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a7a3f83-5f7c-41b1-ab20-e93fecdf8ffe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8a7a3f83-5f7c-41b1-ab20-e93fecdf8ffe"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abac3d28-95cd-4044-8089-443f0ddacc0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abac3d28-95cd-4044-8089-443f0ddacc0e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abac3d28-95cd-4044-8089-443f0ddacc0e
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-47e8987f-03e1-4bd1-a9ae-c4647e0778b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e8987f-03e1-4bd1-a9ae-c4647e0778b2
Content-Type: application/json

--- request body ---
{"handle":"qa-2ffd5c56d349","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47e8987f-03e1-4bd1-a9ae-c4647e0778b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47e8987f-03e1-4bd1-a9ae-c4647e0778b2"}
```
