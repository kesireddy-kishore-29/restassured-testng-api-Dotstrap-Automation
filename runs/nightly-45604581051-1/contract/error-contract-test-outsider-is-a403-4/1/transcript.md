# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[4]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-3095540f-e855-4111-aa8b-d92837f2af9c` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-dd43782e-489d-4bb4-9935-9551abdaaf59` |
| 3 | `POST /v1/accounts` | 201 | 14 | `qa-65bb83b0-e489-4ca2-b43b-63c7423ede0f` |
| 4 | `POST /v1/auth/token` | 200 | 15 | `qa-c4c52ac1-5a4c-4927-97ce-e61b0f63d96d` |
| 5 | `POST /v1/conversations` | 201 | 26 | `qa-2eb84d81-9f0e-4fd0-b80c-a9f05cb33cd6` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-66d8b955-f520-431a-b7ba-ca219d3fa906` |
| 7 | `POST /v1/conversations/{id}/close` | 403 | 13 | `qa-d37fcc78-a312-4e0f-af8e-df0b16e52466` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-23f610dd-24df-4ce0-b8f0-a94e3c30866d` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-5a241d83-071c-4bae-84c1-f86c112fa5dc` |
| 10 | `POST /v1/auth/token` | 200 | 33 | `qa-bf0c4978-cc83-4e18-a1bc-54c75b616c3e` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-094fb155-160b-4073-b8bb-93eb4d148ace` |
| 12 | `POST /v1/auth/token` | 401 | 11 | `qa-46df854e-0c62-455b-a95a-7c0c2800e277` |
| 13 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-adc9e3d1-704f-4ddd-94dc-ba1d78ba235b` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-4f58be60-0752-4409-a551-814c757052ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3095540f-e855-4111-aa8b-d92837f2af9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3095540f-e855-4111-aa8b-d92837f2af9c
Content-Type: application/json

--- request body ---
{"handle":"qa-2de4143449be","displayName":"QA 2de4143449be","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3095540f-e855-4111-aa8b-d92837f2af9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-2de4143449be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d1b775f-c09c-4206-9e00-fe65b604f0be","handle":"qa-2de4143449be","displayName":"QA 2de4143449be","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.530815530Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd43782e-489d-4bb4-9935-9551abdaaf59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd43782e-489d-4bb4-9935-9551abdaaf59
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc78a64dc1e","displayName":"QA 3dc78a64dc1e","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd43782e-489d-4bb4-9935-9551abdaaf59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Location: /v1/accounts/qa-3dc78a64dc1e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_776119f0-761b-445a-b1b2-f15e7f375751","handle":"qa-3dc78a64dc1e","displayName":"QA 3dc78a64dc1e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.581708550Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-65bb83b0-e489-4ca2-b43b-63c7423ede0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65bb83b0-e489-4ca2-b43b-63c7423ede0f
Content-Type: application/json

--- request body ---
{"handle":"qa-f959879486df","displayName":"QA f959879486df","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-65bb83b0-e489-4ca2-b43b-63c7423ede0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Location: /v1/accounts/qa-f959879486df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d9aeedd-87c1-4499-8068-b14b99b3e031","handle":"qa-f959879486df","displayName":"QA f959879486df","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.609101618Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c4c52ac1-5a4c-4927-97ce-e61b0f63d96d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4c52ac1-5a4c-4927-97ce-e61b0f63d96d
Content-Type: application/json

--- request body ---
{"handle":"qa-2de4143449be","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4c52ac1-5a4c-4927-97ce-e61b0f63d96d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d1b775f-c09c-4206-9e00-fe65b604f0be"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2eb84d81-9f0e-4fd0-b80c-a9f05cb33cd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eb84d81-9f0e-4fd0-b80c-a9f05cb33cd6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3dc78a64dc1e","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eb84d81-9f0e-4fd0-b80c-a9f05cb33cd6
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
Location: /v1/conversations/cnv_f84d4a31-6a1f-48d3-af9a-4cebed80507a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f84d4a31-6a1f-48d3-af9a-4cebed80507a","subject":"Error contract","status":"open","region":"eu","participants":["qa-2de4143449be","qa-3dc78a64dc1e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:58.674261450Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-66d8b955-f520-431a-b7ba-ca219d3fa906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66d8b955-f520-431a-b7ba-ca219d3fa906
Content-Type: application/json

--- request body ---
{"handle":"qa-f959879486df","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-66d8b955-f520-431a-b7ba-ca219d3fa906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d9aeedd-87c1-4499-8068-b14b99b3e031"}
```

## 7. POST /v1/conversations/{id}/close

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f84d4a31-6a1f-48d3-af9a-4cebed80507a/close
correlation: qa-d37fcc78-a312-4e0f-af8e-df0b16e52466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d37fcc78-a312-4e0f-af8e-df0b16e52466
Content-Type: application/json

--- response: 403 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d37fcc78-a312-4e0f-af8e-df0b16e52466
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
Content-Length: 291

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_f84d4a31-6a1f-48d3-af9a-4cebed80507a/close","correlationId":"qa-d37fcc78-a312-4e0f-af8e-df0b16e52466"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23f610dd-24df-4ce0-b8f0-a94e3c30866d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f610dd-24df-4ce0-b8f0-a94e3c30866d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23f610dd-24df-4ce0-b8f0-a94e3c30866d
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
correlation: qa-5a241d83-071c-4bae-84c1-f86c112fa5dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a241d83-071c-4bae-84c1-f86c112fa5dc
Content-Type: application/json

--- request body ---
{"handle":"qa-f959879486df","password":"****"}

--- response: 401 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a241d83-071c-4bae-84c1-f86c112fa5dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a241d83-071c-4bae-84c1-f86c112fa5dc"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-bf0c4978-cc83-4e18-a1bc-54c75b616c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf0c4978-cc83-4e18-a1bc-54c75b616c3e
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc78a64dc1e","password":"****"}

--- response: 200 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf0c4978-cc83-4e18-a1bc-54c75b616c3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_776119f0-761b-445a-b1b2-f15e7f375751"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-094fb155-160b-4073-b8bb-93eb4d148ace

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-094fb155-160b-4073-b8bb-93eb4d148ace
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-094fb155-160b-4073-b8bb-93eb4d148ace
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
correlation: qa-46df854e-0c62-455b-a95a-7c0c2800e277

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46df854e-0c62-455b-a95a-7c0c2800e277
Content-Type: application/json

--- request body ---
{"handle":"qa-3dc78a64dc1e","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46df854e-0c62-455b-a95a-7c0c2800e277
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46df854e-0c62-455b-a95a-7c0c2800e277"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-adc9e3d1-704f-4ddd-94dc-ba1d78ba235b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adc9e3d1-704f-4ddd-94dc-ba1d78ba235b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-adc9e3d1-704f-4ddd-94dc-ba1d78ba235b
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
correlation: qa-4f58be60-0752-4409-a551-814c757052ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f58be60-0752-4409-a551-814c757052ea
Content-Type: application/json

--- request body ---
{"handle":"qa-2de4143449be","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f58be60-0752-4409-a551-814c757052ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f58be60-0752-4409-a551-814c757052ea"}
```
