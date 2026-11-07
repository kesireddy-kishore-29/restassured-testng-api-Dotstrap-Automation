# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-cde21a49-061e-4e07-a87c-16e801c7d686` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-c8abf3d7-1767-4854-bdf5-965652136af1` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-e2575aa7-23c3-46ff-a984-d3be106a9184` |
| 4 | `POST /v1/auth/token` | 200 | 28 | `qa-7317b5b8-fbe3-4d89-ab74-d50ef2edd8ad` |
| 5 | `POST /v1/conversations` | 201 | 18 | `qa-88354a5b-c370-42f9-8f79-98d4293ea4ae` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-58a11402-ec3d-4a33-9643-ef7919da99f1` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 14 | `qa-d05a4e90-f877-4853-81bb-2222c1fd9e39` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-ffd10755-97aa-4f87-bbb4-727e33d1aeaf` |
| 9 | `POST /v1/auth/token` | 401 | 17 | `qa-bc0bbdce-c30c-4450-a099-83d6f30acb8b` |
| 10 | `POST /v1/auth/token` | 200 | 34 | `qa-d3bab469-2c4a-42c2-8040-96d092ca56f6` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-5fe767f3-fe00-4c2d-ac0d-72a2856be59b` |
| 12 | `POST /v1/auth/token` | 401 | 5 | `qa-3703ecb7-8b50-4a18-8a7a-35c3049f8e71` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-ee0aa620-d266-4aa4-9ce7-cb7a1067aeb1` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-227e03b7-9b28-43cd-9e7d-8efa8543ce7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cde21a49-061e-4e07-a87c-16e801c7d686

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cde21a49-061e-4e07-a87c-16e801c7d686
Content-Type: application/json

--- request body ---
{"handle":"qa-421866b76c40","displayName":"QA 421866b76c40","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cde21a49-061e-4e07-a87c-16e801c7d686
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Location: /v1/accounts/qa-421866b76c40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_001c7a5a-eb11-4675-aa1b-1b364a221081","handle":"qa-421866b76c40","displayName":"QA 421866b76c40","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.230682874Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c8abf3d7-1767-4854-bdf5-965652136af1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8abf3d7-1767-4854-bdf5-965652136af1
Content-Type: application/json

--- request body ---
{"handle":"qa-2e07eeac9eef","displayName":"QA 2e07eeac9eef","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8abf3d7-1767-4854-bdf5-965652136af1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 10
Location: /v1/accounts/qa-2e07eeac9eef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b500e3d-d68c-4df3-952d-424bc68da326","handle":"qa-2e07eeac9eef","displayName":"QA 2e07eeac9eef","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.272581173Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-e2575aa7-23c3-46ff-a984-d3be106a9184

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2575aa7-23c3-46ff-a984-d3be106a9184
Content-Type: application/json

--- request body ---
{"handle":"qa-a5657a23e8df","displayName":"QA a5657a23e8df","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2575aa7-23c3-46ff-a984-d3be106a9184
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-a5657a23e8df
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0aae9229-cc54-4132-91f9-a3672678feea","handle":"qa-a5657a23e8df","displayName":"QA a5657a23e8df","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.311382420Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7317b5b8-fbe3-4d89-ab74-d50ef2edd8ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7317b5b8-fbe3-4d89-ab74-d50ef2edd8ad
Content-Type: application/json

--- request body ---
{"handle":"qa-421866b76c40","password":"****"}

--- response: 200 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7317b5b8-fbe3-4d89-ab74-d50ef2edd8ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_001c7a5a-eb11-4675-aa1b-1b364a221081"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-88354a5b-c370-42f9-8f79-98d4293ea4ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88354a5b-c370-42f9-8f79-98d4293ea4ae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2e07eeac9eef","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-88354a5b-c370-42f9-8f79-98d4293ea4ae
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
Location: /v1/conversations/cnv_0f58e741-50a0-4d05-a4b3-5d8c6f20461d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0f58e741-50a0-4d05-a4b3-5d8c6f20461d","subject":"Error contract","status":"open","region":"eu","participants":["qa-421866b76c40","qa-2e07eeac9eef"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.389117168Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-58a11402-ec3d-4a33-9643-ef7919da99f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58a11402-ec3d-4a33-9643-ef7919da99f1
Content-Type: application/json

--- request body ---
{"handle":"qa-a5657a23e8df","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-58a11402-ec3d-4a33-9643-ef7919da99f1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0aae9229-cc54-4132-91f9-a3672678feea"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_0f58e741-50a0-4d05-a4b3-5d8c6f20461d/messages
correlation: qa-d05a4e90-f877-4853-81bb-2222c1fd9e39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d05a4e90-f877-4853-81bb-2222c1fd9e39
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d05a4e90-f877-4853-81bb-2222c1fd9e39
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_0f58e741-50a0-4d05-a4b3-5d8c6f20461d/messages","correlationId":"qa-d05a4e90-f877-4853-81bb-2222c1fd9e39"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffd10755-97aa-4f87-bbb4-727e33d1aeaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffd10755-97aa-4f87-bbb4-727e33d1aeaf
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffd10755-97aa-4f87-bbb4-727e33d1aeaf
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
correlation: qa-bc0bbdce-c30c-4450-a099-83d6f30acb8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc0bbdce-c30c-4450-a099-83d6f30acb8b
Content-Type: application/json

--- request body ---
{"handle":"qa-a5657a23e8df","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc0bbdce-c30c-4450-a099-83d6f30acb8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc0bbdce-c30c-4450-a099-83d6f30acb8b"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-d3bab469-2c4a-42c2-8040-96d092ca56f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3bab469-2c4a-42c2-8040-96d092ca56f6
Content-Type: application/json

--- request body ---
{"handle":"qa-2e07eeac9eef","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3bab469-2c4a-42c2-8040-96d092ca56f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b500e3d-d68c-4df3-952d-424bc68da326"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5fe767f3-fe00-4c2d-ac0d-72a2856be59b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fe767f3-fe00-4c2d-ac0d-72a2856be59b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5fe767f3-fe00-4c2d-ac0d-72a2856be59b
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
correlation: qa-3703ecb7-8b50-4a18-8a7a-35c3049f8e71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3703ecb7-8b50-4a18-8a7a-35c3049f8e71
Content-Type: application/json

--- request body ---
{"handle":"qa-2e07eeac9eef","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3703ecb7-8b50-4a18-8a7a-35c3049f8e71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3703ecb7-8b50-4a18-8a7a-35c3049f8e71"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee0aa620-d266-4aa4-9ce7-cb7a1067aeb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee0aa620-d266-4aa4-9ce7-cb7a1067aeb1
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee0aa620-d266-4aa4-9ce7-cb7a1067aeb1
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
correlation: qa-227e03b7-9b28-43cd-9e7d-8efa8543ce7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-227e03b7-9b28-43cd-9e7d-8efa8543ce7a
Content-Type: application/json

--- request body ---
{"handle":"qa-421866b76c40","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-227e03b7-9b28-43cd-9e7d-8efa8543ce7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-227e03b7-9b28-43cd-9e7d-8efa8543ce7a"}
```
