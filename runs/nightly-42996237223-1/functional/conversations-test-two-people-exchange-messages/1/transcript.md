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
| 1 | `POST /v1/accounts` | 201 | 343 | `qa-838d7bb1-20bb-42fd-8d51-31a1bfbfbd03` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-6af9dc84-df26-472b-b2c7-152e28606a4f` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-8509e6a6-81d5-4810-838d-d7f4711fa51a` |
| 4 | `POST /v1/conversations` | 201 | 59 | `qa-b17a1c38-1e2b-4077-af9d-c6bc71d34af4` |
| 5 | `POST /v1/auth/token` | 200 | 25 | `qa-e9e40bf0-193a-4c65-96f5-031697280d5b` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-911667d2-c4ff-41f9-a9e4-5ce913388e81` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 21 | `qa-65d688ae-2ea5-4d52-97f7-8fed018a3400` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-72474131-33cf-4c61-ab94-6a5480dea1f1` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-0d415cbe-47b8-40fa-8e37-88835568e6f6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-bd05ff27-9b83-4b80-816a-3f366cd70f2a` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-a8ae7403-ee36-4a63-b2e7-0e5b68edf3ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-838d7bb1-20bb-42fd-8d51-31a1bfbfbd03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-838d7bb1-20bb-42fd-8d51-31a1bfbfbd03
Content-Type: application/json

--- request body ---
{"handle":"qa-6f2ab08ae79c","displayName":"QA 6f2ab08ae79c","password":"****","region":"eu"}

--- response: 201 in 343 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-838d7bb1-20bb-42fd-8d51-31a1bfbfbd03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-6f2ab08ae79c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_540b41b3-718b-4eae-84e5-3c5e30f4f6cd","handle":"qa-6f2ab08ae79c","displayName":"QA 6f2ab08ae79c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.040014766Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6af9dc84-df26-472b-b2c7-152e28606a4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af9dc84-df26-472b-b2c7-152e28606a4f
Content-Type: application/json

--- request body ---
{"handle":"qa-1723fc10f4a3","displayName":"QA 1723fc10f4a3","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-6af9dc84-df26-472b-b2c7-152e28606a4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-1723fc10f4a3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5119c2f2-16d3-4b9f-b69d-edb40998209d","handle":"qa-1723fc10f4a3","displayName":"QA 1723fc10f4a3","region":"eu","role":"user","createdAt":"2026-11-11T09:34:31.354870820Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8509e6a6-81d5-4810-838d-d7f4711fa51a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8509e6a6-81d5-4810-838d-d7f4711fa51a
Content-Type: application/json

--- request body ---
{"handle":"qa-6f2ab08ae79c","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-8509e6a6-81d5-4810-838d-d7f4711fa51a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_540b41b3-718b-4eae-84e5-3c5e30f4f6cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b17a1c38-1e2b-4077-af9d-c6bc71d34af4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b17a1c38-1e2b-4077-af9d-c6bc71d34af4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1723fc10f4a3","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 59 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b17a1c38-1e2b-4077-af9d-c6bc71d34af4
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
Location: /v1/conversations/cnv_b9c59f0f-8942-4bac-bc5a-df542f987969
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_b9c59f0f-8942-4bac-bc5a-df542f987969","subject":"Lunch?","status":"open","region":"eu","participants":["qa-6f2ab08ae79c","qa-1723fc10f4a3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:31.498247737Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e9e40bf0-193a-4c65-96f5-031697280d5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9e40bf0-193a-4c65-96f5-031697280d5b
Content-Type: application/json

--- request body ---
{"handle":"qa-1723fc10f4a3","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9e40bf0-193a-4c65-96f5-031697280d5b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5119c2f2-16d3-4b9f-b69d-edb40998209d"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b9c59f0f-8942-4bac-bc5a-df542f987969/messages
correlation: qa-911667d2-c4ff-41f9-a9e4-5ce913388e81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-911667d2-c4ff-41f9-a9e4-5ce913388e81
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-911667d2-c4ff-41f9-a9e4-5ce913388e81
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

{"id":"msg_2bdb261f-1be3-458d-bc39-210632f47486","conversationId":"cnv_b9c59f0f-8942-4bac-bc5a-df542f987969","sender":"qa-1723fc10f4a3","body":"Friday works","createdAt":"2026-11-11T09:34:31.599387483Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b9c59f0f-8942-4bac-bc5a-df542f987969/messages
correlation: qa-65d688ae-2ea5-4d52-97f7-8fed018a3400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65d688ae-2ea5-4d52-97f7-8fed018a3400
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-65d688ae-2ea5-4d52-97f7-8fed018a3400
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

{"items":[{"id":"msg_2e6aeae0-c237-47db-82ef-8a9b22353158","conversationId":"cnv_b9c59f0f-8942-4bac-bc5a-df542f987969","sender":"qa-6f2ab08ae79c","body":"Free on Friday?","createdAt":"2026-11-11T09:34:31.498435142Z"},{"id":"msg_2bdb261f-1be3-458d-bc39-210632f47486","conversationId":"cnv_b9c59f0f-8942-4bac-bc5a-df542f987969","sender":"qa-1723fc10f4a3","body":"Friday works","createdAt":"2026-11-11T09:34:31.599387483Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72474131-33cf-4c61-ab94-6a5480dea1f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72474131-33cf-4c61-ab94-6a5480dea1f1
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72474131-33cf-4c61-ab94-6a5480dea1f1
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
correlation: qa-0d415cbe-47b8-40fa-8e37-88835568e6f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d415cbe-47b8-40fa-8e37-88835568e6f6
Content-Type: application/json

--- request body ---
{"handle":"qa-1723fc10f4a3","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d415cbe-47b8-40fa-8e37-88835568e6f6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d415cbe-47b8-40fa-8e37-88835568e6f6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd05ff27-9b83-4b80-816a-3f366cd70f2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd05ff27-9b83-4b80-816a-3f366cd70f2a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd05ff27-9b83-4b80-816a-3f366cd70f2a
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
correlation: qa-a8ae7403-ee36-4a63-b2e7-0e5b68edf3ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8ae7403-ee36-4a63-b2e7-0e5b68edf3ce
Content-Type: application/json

--- request body ---
{"handle":"qa-6f2ab08ae79c","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8ae7403-ee36-4a63-b2e7-0e5b68edf3ce
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a8ae7403-ee36-4a63-b2e7-0e5b68edf3ce"}
```
