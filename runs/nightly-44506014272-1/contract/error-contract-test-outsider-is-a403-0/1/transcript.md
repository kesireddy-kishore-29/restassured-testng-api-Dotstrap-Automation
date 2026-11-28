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
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-a0531862-730f-4bdc-a244-9bb833474a70` |
| 2 | `POST /v1/accounts` | 201 | 37 | `qa-6593e5d4-11fd-4613-b2c4-c8c979a92d1a` |
| 3 | `POST /v1/accounts` | 201 | 34 | `qa-de991f1a-c4dd-4095-94f1-3c3915a78a28` |
| 4 | `POST /v1/auth/token` | 200 | 43 | `qa-e9671c0f-4cd8-447d-b938-e780f23f24df` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-d84faad6-d793-479d-bcb8-e187f5483e0d` |
| 6 | `POST /v1/auth/token` | 200 | 51 | `qa-019b9251-b1e5-40ab-8633-1256da9c41ed` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-5b4fc22e-cba4-47a9-a467-2f3ad6609de7` |
| 8 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-c137d700-bd40-4170-9b3b-ab3283b73bd6` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-8c9e25fc-e128-40c8-985a-1e24451d4ebb` |
| 10 | `POST /v1/auth/token` | 200 | 60 | `qa-650ab6a0-d3bb-4857-a078-a48b4a28ccd7` |
| 11 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-b61d6f13-db72-4034-92ae-db6f328a1c4b` |
| 12 | `POST /v1/auth/token` | 401 | 36 | `qa-1fe4672c-c629-413e-bc55-5b315b3c8d24` |
| 13 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-0d9e2421-ccf9-4669-8a47-eabcd2107304` |
| 14 | `POST /v1/auth/token` | 401 | 82 | `qa-4a708028-4e03-4772-a731-4caf0ac664cf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0531862-730f-4bdc-a244-9bb833474a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0531862-730f-4bdc-a244-9bb833474a70
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c52e27fe8","displayName":"QA 3f6c52e27fe8","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0531862-730f-4bdc-a244-9bb833474a70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Location: /v1/accounts/qa-3f6c52e27fe8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_437c2685-6f80-497f-a3d2-d85a397acca4","handle":"qa-3f6c52e27fe8","displayName":"QA 3f6c52e27fe8","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.808756438Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6593e5d4-11fd-4613-b2c4-c8c979a92d1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6593e5d4-11fd-4613-b2c4-c8c979a92d1a
Content-Type: application/json

--- request body ---
{"handle":"qa-2e6343ec0f23","displayName":"QA 2e6343ec0f23","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6593e5d4-11fd-4613-b2c4-c8c979a92d1a
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
Location: /v1/accounts/qa-2e6343ec0f23
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d134c752-c283-4f2c-b191-b2ca24a1d3c3","handle":"qa-2e6343ec0f23","displayName":"QA 2e6343ec0f23","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.865659324Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-de991f1a-c4dd-4095-94f1-3c3915a78a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de991f1a-c4dd-4095-94f1-3c3915a78a28
Content-Type: application/json

--- request body ---
{"handle":"qa-58a7ea9c853b","displayName":"QA 58a7ea9c853b","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-de991f1a-c4dd-4095-94f1-3c3915a78a28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Location: /v1/accounts/qa-58a7ea9c853b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a95fbe56-ed89-4bbe-ad12-1c54fbb81564","handle":"qa-58a7ea9c853b","displayName":"QA 58a7ea9c853b","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.919886192Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e9671c0f-4cd8-447d-b938-e780f23f24df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9671c0f-4cd8-447d-b938-e780f23f24df
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c52e27fe8","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9671c0f-4cd8-447d-b938-e780f23f24df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_437c2685-6f80-497f-a3d2-d85a397acca4"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d84faad6-d793-479d-bcb8-e187f5483e0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d84faad6-d793-479d-bcb8-e187f5483e0d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2e6343ec0f23","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d84faad6-d793-479d-bcb8-e187f5483e0d
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
Location: /v1/conversations/cnv_ce84c95f-79c3-4b68-9730-08eff8583f64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ce84c95f-79c3-4b68-9730-08eff8583f64","subject":"Error contract","status":"open","region":"eu","participants":["qa-3f6c52e27fe8","qa-2e6343ec0f23"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:24.012650460Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-019b9251-b1e5-40ab-8633-1256da9c41ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-019b9251-b1e5-40ab-8633-1256da9c41ed
Content-Type: application/json

--- request body ---
{"handle":"qa-58a7ea9c853b","password":"****"}

--- response: 200 in 51 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-019b9251-b1e5-40ab-8633-1256da9c41ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a95fbe56-ed89-4bbe-ad12-1c54fbb81564"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_ce84c95f-79c3-4b68-9730-08eff8583f64
correlation: qa-5b4fc22e-cba4-47a9-a467-2f3ad6609de7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4fc22e-cba4-47a9-a467-2f3ad6609de7
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b4fc22e-cba4-47a9-a467-2f3ad6609de7
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_ce84c95f-79c3-4b68-9730-08eff8583f64","correlationId":"qa-5b4fc22e-cba4-47a9-a467-2f3ad6609de7"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c137d700-bd40-4170-9b3b-ab3283b73bd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c137d700-bd40-4170-9b3b-ab3283b73bd6
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c137d700-bd40-4170-9b3b-ab3283b73bd6
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
correlation: qa-8c9e25fc-e128-40c8-985a-1e24451d4ebb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c9e25fc-e128-40c8-985a-1e24451d4ebb
Content-Type: application/json

--- request body ---
{"handle":"qa-58a7ea9c853b","password":"****"}

--- response: 401 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8c9e25fc-e128-40c8-985a-1e24451d4ebb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 515
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8c9e25fc-e128-40c8-985a-1e24451d4ebb"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-650ab6a0-d3bb-4857-a078-a48b4a28ccd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-650ab6a0-d3bb-4857-a078-a48b4a28ccd7
Content-Type: application/json

--- request body ---
{"handle":"qa-2e6343ec0f23","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-650ab6a0-d3bb-4857-a078-a48b4a28ccd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 506
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d134c752-c283-4f2c-b191-b2ca24a1d3c3"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b61d6f13-db72-4034-92ae-db6f328a1c4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b61d6f13-db72-4034-92ae-db6f328a1c4b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b61d6f13-db72-4034-92ae-db6f328a1c4b
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
correlation: qa-1fe4672c-c629-413e-bc55-5b315b3c8d24

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1fe4672c-c629-413e-bc55-5b315b3c8d24
Content-Type: application/json

--- request body ---
{"handle":"qa-2e6343ec0f23","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1fe4672c-c629-413e-bc55-5b315b3c8d24
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1fe4672c-c629-413e-bc55-5b315b3c8d24"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0d9e2421-ccf9-4669-8a47-eabcd2107304

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9e2421-ccf9-4669-8a47-eabcd2107304
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0d9e2421-ccf9-4669-8a47-eabcd2107304
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-4a708028-4e03-4772-a731-4caf0ac664cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a708028-4e03-4772-a731-4caf0ac664cf
Content-Type: application/json

--- request body ---
{"handle":"qa-3f6c52e27fe8","password":"****"}

--- response: 401 in 82 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a708028-4e03-4772-a731-4caf0ac664cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a708028-4e03-4772-a731-4caf0ac664cf"}
```
