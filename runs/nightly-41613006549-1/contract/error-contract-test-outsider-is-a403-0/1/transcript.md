# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 385 | `qa-b3469e74-c59b-4a2e-89e6-4a05050bfe51` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-52175713-30e2-4fef-8ff9-94919a361ac8` |
| 3 | `POST /v1/accounts` | 201 | 41 | `qa-2a69b2bc-226a-4f68-b726-87860b3a3352` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-ff0e85f7-c20b-4adf-80c2-2979a7fc1a9a` |
| 5 | `POST /v1/conversations` | 201 | 49 | `qa-2e82006a-4025-492d-8e7b-d9cb9b21337f` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-363d3f8b-47e3-44f0-a698-e72b0606e0c2` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-466cda74-a264-42d3-83d1-8309c45c5a94` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-4701cc60-e6f8-4c01-8606-9601eef30f07` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-516402e7-560c-4da0-bf13-e412f17a1d34` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-0e2036c5-7665-4b70-a331-0cf6678a109e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-58ad43e4-a601-4d92-b317-4a8c702b552f` |
| 12 | `POST /v1/auth/token` | 401 | 32 | `qa-17ffdee9-f972-4a71-b918-0bc803e29360` |
| 13 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-a2535ba2-7ff4-4614-a448-1e3a037813d1` |
| 14 | `POST /v1/auth/token` | 401 | 12 | `qa-4ab9551f-0faa-429b-882b-c1f07886df71` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3469e74-c59b-4a2e-89e6-4a05050bfe51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3469e74-c59b-4a2e-89e6-4a05050bfe51
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7c859e709","displayName":"QA f8b7c859e709","password":"****","region":"eu"}

--- response: 201 in 385 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3469e74-c59b-4a2e-89e6-4a05050bfe51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Location: /v1/accounts/qa-f8b7c859e709
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ec2d8d9-2675-4606-858a-adf25150f3ad","handle":"qa-f8b7c859e709","displayName":"QA f8b7c859e709","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.887695827Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-52175713-30e2-4fef-8ff9-94919a361ac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52175713-30e2-4fef-8ff9-94919a361ac8
Content-Type: application/json

--- request body ---
{"handle":"qa-6e3568cfbafe","displayName":"QA 6e3568cfbafe","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-52175713-30e2-4fef-8ff9-94919a361ac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Location: /v1/accounts/qa-6e3568cfbafe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4ad658b-3313-4d9c-9138-dfa2fc68575e","handle":"qa-6e3568cfbafe","displayName":"QA 6e3568cfbafe","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.236583742Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2a69b2bc-226a-4f68-b726-87860b3a3352

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a69b2bc-226a-4f68-b726-87860b3a3352
Content-Type: application/json

--- request body ---
{"handle":"qa-f8931f83045f","displayName":"QA f8931f83045f","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a69b2bc-226a-4f68-b726-87860b3a3352
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-f8931f83045f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34dc3bc3-446a-4a63-a1ce-5630e53fad9e","handle":"qa-f8931f83045f","displayName":"QA f8931f83045f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.283287762Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-ff0e85f7-c20b-4adf-80c2-2979a7fc1a9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff0e85f7-c20b-4adf-80c2-2979a7fc1a9a
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7c859e709","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff0e85f7-c20b-4adf-80c2-2979a7fc1a9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ec2d8d9-2675-4606-858a-adf25150f3ad"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2e82006a-4025-492d-8e7b-d9cb9b21337f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e82006a-4025-492d-8e7b-d9cb9b21337f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6e3568cfbafe","subject":"Error contract","message":"Hi"}

--- response: 201 in 49 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e82006a-4025-492d-8e7b-d9cb9b21337f
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
Location: /v1/conversations/cnv_a4c488c1-0616-4bb8-9e96-312fdc48b5ea
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a4c488c1-0616-4bb8-9e96-312fdc48b5ea","subject":"Error contract","status":"open","region":"eu","participants":["qa-f8b7c859e709","qa-6e3568cfbafe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.406646093Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-363d3f8b-47e3-44f0-a698-e72b0606e0c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-363d3f8b-47e3-44f0-a698-e72b0606e0c2
Content-Type: application/json

--- request body ---
{"handle":"qa-f8931f83045f","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-363d3f8b-47e3-44f0-a698-e72b0606e0c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34dc3bc3-446a-4a63-a1ce-5630e53fad9e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a4c488c1-0616-4bb8-9e96-312fdc48b5ea
correlation: qa-466cda74-a264-42d3-83d1-8309c45c5a94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466cda74-a264-42d3-83d1-8309c45c5a94
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-466cda74-a264-42d3-83d1-8309c45c5a94
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a4c488c1-0616-4bb8-9e96-312fdc48b5ea","correlationId":"qa-466cda74-a264-42d3-83d1-8309c45c5a94"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4701cc60-e6f8-4c01-8606-9601eef30f07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4701cc60-e6f8-4c01-8606-9601eef30f07
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4701cc60-e6f8-4c01-8606-9601eef30f07
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
correlation: qa-516402e7-560c-4da0-bf13-e412f17a1d34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-516402e7-560c-4da0-bf13-e412f17a1d34
Content-Type: application/json

--- request body ---
{"handle":"qa-f8931f83045f","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-516402e7-560c-4da0-bf13-e412f17a1d34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-516402e7-560c-4da0-bf13-e412f17a1d34"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0e2036c5-7665-4b70-a331-0cf6678a109e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2036c5-7665-4b70-a331-0cf6678a109e
Content-Type: application/json

--- request body ---
{"handle":"qa-6e3568cfbafe","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e2036c5-7665-4b70-a331-0cf6678a109e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4ad658b-3313-4d9c-9138-dfa2fc68575e"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58ad43e4-a601-4d92-b317-4a8c702b552f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58ad43e4-a601-4d92-b317-4a8c702b552f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58ad43e4-a601-4d92-b317-4a8c702b552f
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-17ffdee9-f972-4a71-b918-0bc803e29360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17ffdee9-f972-4a71-b918-0bc803e29360
Content-Type: application/json

--- request body ---
{"handle":"qa-6e3568cfbafe","password":"****"}

--- response: 401 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17ffdee9-f972-4a71-b918-0bc803e29360
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17ffdee9-f972-4a71-b918-0bc803e29360"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a2535ba2-7ff4-4614-a448-1e3a037813d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2535ba2-7ff4-4614-a448-1e3a037813d1
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a2535ba2-7ff4-4614-a448-1e3a037813d1
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4ab9551f-0faa-429b-882b-c1f07886df71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ab9551f-0faa-429b-882b-c1f07886df71
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7c859e709","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4ab9551f-0faa-429b-882b-c1f07886df71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4ab9551f-0faa-429b-882b-c1f07886df71"}
```
