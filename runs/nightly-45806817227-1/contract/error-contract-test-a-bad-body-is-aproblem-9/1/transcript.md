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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-a51f67a7-1810-49f9-b928-81806e5885aa` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-df975e24-de49-4acb-adc0-54b016437f69` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-e89ecfbc-191a-4bed-96cc-51f45476d50f` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-378f25cd-0f52-4bc8-acef-ff92b02f3b0b` |
| 5 | `POST /v1/conversations` | 400 | 26 | `qa-10e799b0-b569-420f-a10a-5275d6c29eca` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-23850a82-d608-42b4-8058-c3237d78bec7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-3afd3055-a9da-4987-96e9-1505da8cd18d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-feb1fe6f-23b8-4ac0-b172-8dfd578433a7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-b073e956-5b28-4dd4-80de-3ef26df09c34` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-e87b458a-8663-470e-8e26-421541fcc9d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a51f67a7-1810-49f9-b928-81806e5885aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a51f67a7-1810-49f9-b928-81806e5885aa
Content-Type: application/json

--- request body ---
{"handle":"qa-7f7f496c3718","displayName":"QA 7f7f496c3718","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a51f67a7-1810-49f9-b928-81806e5885aa
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
Location: /v1/accounts/qa-7f7f496c3718
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a2fe535-b988-4c0e-bd09-caefd45d93ac","handle":"qa-7f7f496c3718","displayName":"QA 7f7f496c3718","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.796880124Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-df975e24-de49-4acb-adc0-54b016437f69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df975e24-de49-4acb-adc0-54b016437f69
Content-Type: application/json

--- request body ---
{"handle":"qa-30a7cec5e440","displayName":"QA 30a7cec5e440","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-df975e24-de49-4acb-adc0-54b016437f69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Location: /v1/accounts/qa-30a7cec5e440
X-Served-Region: eu
Content-Length: 181

{"id":"acc_094b3aec-0913-4e25-b073-3155d39735bf","handle":"qa-30a7cec5e440","displayName":"QA 30a7cec5e440","region":"eu","role":"user","createdAt":"2026-11-26T11:02:45.831040246Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e89ecfbc-191a-4bed-96cc-51f45476d50f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e89ecfbc-191a-4bed-96cc-51f45476d50f
Content-Type: application/json

--- request body ---
{"handle":"qa-7f7f496c3718","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e89ecfbc-191a-4bed-96cc-51f45476d50f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a2fe535-b988-4c0e-bd09-caefd45d93ac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-378f25cd-0f52-4bc8-acef-ff92b02f3b0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378f25cd-0f52-4bc8-acef-ff92b02f3b0b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-30a7cec5e440","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-378f25cd-0f52-4bc8-acef-ff92b02f3b0b
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
Location: /v1/conversations/cnv_cfecde78-dc24-44ab-b387-2a6c817197ab
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cfecde78-dc24-44ab-b387-2a6c817197ab","subject":"Error contract","status":"open","region":"eu","participants":["qa-7f7f496c3718","qa-30a7cec5e440"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:45.876103159Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-10e799b0-b569-420f-a10a-5275d6c29eca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10e799b0-b569-420f-a10a-5275d6c29eca
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10e799b0-b569-420f-a10a-5275d6c29eca
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-10e799b0-b569-420f-a10a-5275d6c29eca"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-23850a82-d608-42b4-8058-c3237d78bec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23850a82-d608-42b4-8058-c3237d78bec7
Content-Type: application/json

--- request body ---
{"handle":"qa-30a7cec5e440","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-23850a82-d608-42b4-8058-c3237d78bec7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_094b3aec-0913-4e25-b073-3155d39735bf"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3afd3055-a9da-4987-96e9-1505da8cd18d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3afd3055-a9da-4987-96e9-1505da8cd18d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3afd3055-a9da-4987-96e9-1505da8cd18d
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
correlation: qa-feb1fe6f-23b8-4ac0-b172-8dfd578433a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-feb1fe6f-23b8-4ac0-b172-8dfd578433a7
Content-Type: application/json

--- request body ---
{"handle":"qa-30a7cec5e440","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-feb1fe6f-23b8-4ac0-b172-8dfd578433a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-feb1fe6f-23b8-4ac0-b172-8dfd578433a7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b073e956-5b28-4dd4-80de-3ef26df09c34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b073e956-5b28-4dd4-80de-3ef26df09c34
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b073e956-5b28-4dd4-80de-3ef26df09c34
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
correlation: qa-e87b458a-8663-470e-8e26-421541fcc9d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e87b458a-8663-470e-8e26-421541fcc9d9
Content-Type: application/json

--- request body ---
{"handle":"qa-7f7f496c3718","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e87b458a-8663-470e-8e26-421541fcc9d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e87b458a-8663-470e-8e26-421541fcc9d9"}
```
