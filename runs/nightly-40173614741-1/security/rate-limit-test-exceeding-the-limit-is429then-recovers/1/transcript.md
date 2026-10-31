# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-19fc263e-0895-40b7-9090-afa52369a3c8` |
| 2 | `POST /v1/auth/token` | 200 | 70 | `qa-edc53ac9-5c3f-46d1-b598-366821ec1f9c` |
| 3 | `GET /v1/accounts/me` | 200 | 51 | `qa-ba567e2a-14a9-41d5-9937-e3bbb1deebd5` |
| 4 | `GET /v1/accounts/me` | 200 | 19 | `qa-91ef66ac-bc7c-41e9-9440-257085db4cee` |
| 5 | `GET /v1/accounts/me` | 200 | 24 | `qa-41c96525-d590-48c6-840d-849eed374186` |
| 6 | `GET /v1/accounts/me` | 200 | 22 | `qa-84e961b8-2be8-4afb-81d5-e1aee1bcf68a` |
| 7 | `GET /v1/accounts/me` | 200 | 16 | `qa-71277b3c-f40d-4745-a672-ee14438db0cf` |
| 8 | `GET /v1/accounts/me` | 200 | 21 | `qa-5c697d6a-1fa5-4726-b824-2ef33f559871` |
| 9 | `GET /v1/accounts/me` | 200 | 23 | `qa-a7f7da0b-f29c-4e18-bd56-4884cec6a3f2` |
| 10 | `GET /v1/accounts/me` | 200 | 25 | `qa-cee7cb28-d0eb-49cc-b148-25e06ccb545b` |
| 11 | `GET /v1/accounts/me` | 200 | 13 | `qa-4b48c76a-94ae-48ba-81f4-05abcbdb420d` |
| 12 | `GET /v1/accounts/me` | 200 | 19 | `qa-87008eac-661c-4457-b5d6-40e7bb549428` |
| 13 | `GET /v1/accounts/me` | 200 | 22 | `qa-91c2cd91-6d2f-490b-85d2-41f5b2fc975d` |
| 14 | `GET /v1/accounts/me` | 200 | 12 | `qa-b934d1f3-cdd4-46c6-9071-491f115fc042` |
| 15 | `GET /v1/accounts/me` | 200 | 21 | `qa-ec085543-0e78-4540-8a06-b7d067ddb622` |
| 16 | `GET /v1/accounts/me` | 200 | 26 | `qa-09fc9202-b729-4428-ae3e-a25944df2397` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-eb020f24-42db-4cd2-9488-cc44c6051fc6` |
| 18 | `GET /v1/accounts/me` | 200 | 11 | `qa-46cc48f5-a4d9-45ab-8e67-31e629edc565` |
| 19 | `GET /v1/accounts/me` | 200 | 10 | `qa-2bc7767f-ba11-4e7b-ac5f-1056ded67d50` |
| 20 | `GET /v1/accounts/me` | 200 | 10 | `qa-f563f5d9-5996-434e-aa9b-c3c8d7ca7f90` |
| 21 | `GET /v1/accounts/me` | 200 | 18 | `qa-6d452f74-18b4-42ed-8955-4c1593837e97` |
| 22 | `GET /v1/accounts/me` | 200 | 11 | `qa-219913cc-b412-4db7-91c4-51c2bf209046` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-c96717d3-d90f-46fe-8e76-9f365badc8c2` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-18eacd12-9111-4438-b6c9-be99b7ab4888` |
| 25 | `GET /v1/accounts/me` | 200 | 14 | `qa-39b2a67d-5a4e-48f7-942b-59c15bba02a6` |
| 26 | `GET /v1/accounts/me` | 200 | 11 | `qa-389a390d-8da0-4b8f-b807-972850765fac` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-300abb37-7fb9-453a-af22-b28d1cfcf698` |
| 28 | `GET /v1/accounts/me` | 200 | 7 | `qa-81e24867-f3a7-40e9-afc2-4c4fa0013b90` |
| 29 | `GET /v1/accounts/me` | 200 | 7 | `qa-666ffd2a-7e26-4c03-8adb-bcb74ac574c4` |
| 30 | `GET /v1/accounts/me` | 200 | 12 | `qa-09f791c7-0058-4153-8098-38830ccaf23a` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-189e845b-783c-4ca4-982a-0779831860e1` |
| 32 | `GET /v1/accounts/me` | 200 | 14 | `qa-be43dca9-2596-4c4d-b8e4-f3c40761ff3b` |
| 33 | `GET /v1/accounts/me` | 200 | 7 | `qa-d3595860-d129-4133-958d-897c0e86f693` |
| 34 | `GET /v1/accounts/me` | 200 | 10 | `qa-6e662e2d-d0e8-4243-a4aa-e86418b98386` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-9e069071-d5f6-4062-b9e1-c1df5c87c6cd` |
| 36 | `GET /v1/accounts/me` | 200 | 12 | `qa-3c24a5bc-5cfc-4545-a7e3-ab1d81caeca8` |
| 37 | `GET /v1/accounts/me` | 200 | 8 | `qa-cf54294e-f46b-4c80-ae7a-bcf694acb5ff` |
| 38 | `GET /v1/accounts/me` | 200 | 7 | `qa-2d63954f-04d5-48eb-9c58-fabb091e7e56` |
| 39 | `GET /v1/accounts/me` | 200 | 10 | `qa-5b8ff84d-cdaf-46e5-acc1-a930e6025654` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-673c3d4b-be78-4160-b87b-0ff4b010ade1` |
| 41 | `GET /v1/accounts/me` | 200 | 9 | `qa-e30cf906-fa04-46d9-9ba2-906ae9b9a44f` |
| 42 | `GET /v1/accounts/me` | 200 | 9 | `qa-b86b75eb-2206-40ba-9618-70a7ad2c2b6e` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-24b1c798-e9ee-4ce7-8150-5170c165a8e8` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-d048114e-be2c-46e3-963c-e158db80ef7a` |
| 45 | `GET /v1/accounts/me` | 200 | 7 | `qa-40bb9506-d1dc-4663-8c57-acae649d08e4` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-3a0b8329-4600-48af-9d0f-5c9e3e8ecf2f` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-4f291333-18fa-4eb2-ae0b-7d18495f2679` |
| 48 | `GET /v1/accounts/me` | 200 | 7 | `qa-3ce88273-e144-47b4-b1f1-377bf84e9213` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-e582a910-b658-4971-a84f-1c5c66050deb` |
| 50 | `GET /v1/accounts/me` | 200 | 14 | `qa-2c11e21b-fd84-4993-9ac8-c7b94cc6c71b` |
| 51 | `GET /v1/accounts/me` | 200 | 11 | `qa-65f54ff7-3a88-4613-9c68-67e0ef231a2c` |
| 52 | `GET /v1/accounts/me` | 200 | 10 | `qa-9b84b617-db24-42d5-88fe-b32f17ee8eca` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-5d346ec0-3278-41c9-b93a-31dbc5a8cceb` |
| 54 | `GET /v1/accounts/me` | 200 | 12 | `qa-7467418d-c234-443a-a114-db21017aabeb` |
| 55 | `GET /v1/accounts/me` | 200 | 15 | `qa-431c58db-5082-4bab-a845-86da48d86d7b` |
| 56 | `GET /v1/accounts/me` | 200 | 13 | `qa-17b550cf-cd43-4752-bc88-827535e90e43` |
| 57 | `GET /v1/accounts/me` | 200 | 21 | `qa-b948ef5c-61dc-4120-81af-afdfefb04b5e` |
| 58 | `GET /v1/accounts/me` | 200 | 9 | `qa-f816dc7d-1fb7-426f-a439-69d11338ec7c` |
| 59 | `GET /v1/accounts/me` | 200 | 14 | `qa-0ba68dc2-bd6e-4f77-b339-b66c184a52b7` |
| 60 | `GET /v1/accounts/me` | 200 | 8 | `qa-b09635f2-b7b4-4a8d-80eb-cd0269faace7` |
| 61 | `GET /v1/accounts/me` | 200 | 9 | `qa-ac17842c-5a8f-4416-b542-669aac6e6e5f` |
| 62 | `GET /v1/accounts/me` | 200 | 8 | `qa-7d51ebdf-4190-40a8-b6e4-95d16dc4c59f` |
| 63 | `GET /v1/accounts/me` | 429 | 6 | `qa-81ff7458-7fc5-41ec-ae13-034582815384` |
| 64 | `GET /v1/accounts/me` | 429 | 8 | `qa-cdee58fa-5152-4447-bde4-d313d1373842` |
| 65 | `GET /v1/accounts/me` | 429 | 7 | `qa-5dc37b30-3993-4e93-bddd-710daf69b666` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-d296e4e0-1ff7-4e9f-97ed-1a289952522a` |
| 67 | `GET /v1/accounts/me` | 429 | 5 | `qa-7ef6edc4-4665-4c64-b38a-975bdf6ebfb2` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-7004c140-9274-4c21-b0e5-b7daf66a4be1` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-b18ec2c9-08f8-438b-a7c3-656252397aad` |
| 70 | `GET /v1/accounts/me` | 429 | 6 | `qa-5e2b7e49-a2dd-4883-94b8-2bbd3411918b` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-628afcec-685e-4d3c-bf2c-5e0ae06189d2` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-8f938386-3ae7-4a86-893e-8d5f77010343` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-d07873b1-6a85-4d98-b3db-876bd55cdf21` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-976e5492-2661-4016-90df-b91057e44fbe` |
| 75 | `GET /v1/accounts/me` | 429 | 6 | `qa-b66388a1-c5d1-4cab-addc-dee7e8c9d083` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-787aaeca-c70c-4aa7-9786-a9a4db9eb4f2` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-d7daa932-36b3-4f25-9e83-c533f94205f3` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-88066c94-b97c-424f-b1a0-78be3188758b` |
| 79 | `GET /v1/accounts/me` | 429 | 7 | `qa-49318614-93b5-4c98-a3f7-0379dabf9c76` |
| 80 | `GET /v1/accounts/me` | 200 | 4 | `qa-e4e6d6f0-206c-43d0-b73e-0877b1eba9d0` |
| 81 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-aba60a04-6e21-4639-b891-87ff889cbe3c` |
| 82 | `POST /v1/auth/token` | 401 | 5 | `qa-599837aa-4445-47de-a483-480cf7c9c522` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-19fc263e-0895-40b7-9090-afa52369a3c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19fc263e-0895-40b7-9090-afa52369a3c8
Content-Type: application/json

--- request body ---
{"handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Sun, 25 Oct 2026 07:40:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-19fc263e-0895-40b7-9090-afa52369a3c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-0c6547c69bfc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-edc53ac9-5c3f-46d1-b598-366821ec1f9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edc53ac9-5c3f-46d1-b598-366821ec1f9c
Content-Type: application/json

--- request body ---
{"handle":"qa-0c6547c69bfc","password":"****"}

--- response: 200 in 70 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-edc53ac9-5c3f-46d1-b598-366821ec1f9c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4656401f-3271-488f-b12b-812fa0549bd4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba567e2a-14a9-41d5-9937-e3bbb1deebd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba567e2a-14a9-41d5-9937-e3bbb1deebd5
Content-Type: application/json

--- response: 200 in 51 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba567e2a-14a9-41d5-9937-e3bbb1deebd5
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
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-91ef66ac-bc7c-41e9-9440-257085db4cee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91ef66ac-bc7c-41e9-9440-257085db4cee
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-91ef66ac-bc7c-41e9-9440-257085db4cee
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
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-41c96525-d590-48c6-840d-849eed374186

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41c96525-d590-48c6-840d-849eed374186
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-41c96525-d590-48c6-840d-849eed374186
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
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-84e961b8-2be8-4afb-81d5-e1aee1bcf68a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84e961b8-2be8-4afb-81d5-e1aee1bcf68a
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-84e961b8-2be8-4afb-81d5-e1aee1bcf68a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-71277b3c-f40d-4745-a672-ee14438db0cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71277b3c-f40d-4745-a672-ee14438db0cf
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-71277b3c-f40d-4745-a672-ee14438db0cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-5c697d6a-1fa5-4726-b824-2ef33f559871

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c697d6a-1fa5-4726-b824-2ef33f559871
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c697d6a-1fa5-4726-b824-2ef33f559871
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7f7da0b-f29c-4e18-bd56-4884cec6a3f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7f7da0b-f29c-4e18-bd56-4884cec6a3f2
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7f7da0b-f29c-4e18-bd56-4884cec6a3f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-cee7cb28-d0eb-49cc-b148-25e06ccb545b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cee7cb28-d0eb-49cc-b148-25e06ccb545b
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-cee7cb28-d0eb-49cc-b148-25e06ccb545b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b48c76a-94ae-48ba-81f4-05abcbdb420d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b48c76a-94ae-48ba-81f4-05abcbdb420d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b48c76a-94ae-48ba-81f4-05abcbdb420d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-87008eac-661c-4457-b5d6-40e7bb549428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87008eac-661c-4457-b5d6-40e7bb549428
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-87008eac-661c-4457-b5d6-40e7bb549428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-91c2cd91-6d2f-490b-85d2-41f5b2fc975d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91c2cd91-6d2f-490b-85d2-41f5b2fc975d
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-91c2cd91-6d2f-490b-85d2-41f5b2fc975d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-b934d1f3-cdd4-46c6-9071-491f115fc042

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b934d1f3-cdd4-46c6-9071-491f115fc042
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b934d1f3-cdd4-46c6-9071-491f115fc042
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-ec085543-0e78-4540-8a06-b7d067ddb622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec085543-0e78-4540-8a06-b7d067ddb622
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec085543-0e78-4540-8a06-b7d067ddb622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-09fc9202-b729-4428-ae3e-a25944df2397

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09fc9202-b729-4428-ae3e-a25944df2397
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-09fc9202-b729-4428-ae3e-a25944df2397
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb020f24-42db-4cd2-9488-cc44c6051fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb020f24-42db-4cd2-9488-cc44c6051fc6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb020f24-42db-4cd2-9488-cc44c6051fc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-46cc48f5-a4d9-45ab-8e67-31e629edc565

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46cc48f5-a4d9-45ab-8e67-31e629edc565
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-46cc48f5-a4d9-45ab-8e67-31e629edc565
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bc7767f-ba11-4e7b-ac5f-1056ded67d50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc7767f-ba11-4e7b-ac5f-1056ded67d50
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc7767f-ba11-4e7b-ac5f-1056ded67d50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-f563f5d9-5996-434e-aa9b-c3c8d7ca7f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f563f5d9-5996-434e-aa9b-c3c8d7ca7f90
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f563f5d9-5996-434e-aa9b-c3c8d7ca7f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d452f74-18b4-42ed-8955-4c1593837e97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d452f74-18b4-42ed-8955-4c1593837e97
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d452f74-18b4-42ed-8955-4c1593837e97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-219913cc-b412-4db7-91c4-51c2bf209046

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-219913cc-b412-4db7-91c4-51c2bf209046
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-219913cc-b412-4db7-91c4-51c2bf209046
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-c96717d3-d90f-46fe-8e76-9f365badc8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c96717d3-d90f-46fe-8e76-9f365badc8c2
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c96717d3-d90f-46fe-8e76-9f365badc8c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-18eacd12-9111-4438-b6c9-be99b7ab4888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18eacd12-9111-4438-b6c9-be99b7ab4888
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-18eacd12-9111-4438-b6c9-be99b7ab4888
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-39b2a67d-5a4e-48f7-942b-59c15bba02a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39b2a67d-5a4e-48f7-942b-59c15bba02a6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-39b2a67d-5a4e-48f7-942b-59c15bba02a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-389a390d-8da0-4b8f-b807-972850765fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-389a390d-8da0-4b8f-b807-972850765fac
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-389a390d-8da0-4b8f-b807-972850765fac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-300abb37-7fb9-453a-af22-b28d1cfcf698

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300abb37-7fb9-453a-af22-b28d1cfcf698
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-300abb37-7fb9-453a-af22-b28d1cfcf698
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-81e24867-f3a7-40e9-afc2-4c4fa0013b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81e24867-f3a7-40e9-afc2-4c4fa0013b90
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-81e24867-f3a7-40e9-afc2-4c4fa0013b90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-666ffd2a-7e26-4c03-8adb-bcb74ac574c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666ffd2a-7e26-4c03-8adb-bcb74ac574c4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-666ffd2a-7e26-4c03-8adb-bcb74ac574c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-09f791c7-0058-4153-8098-38830ccaf23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f791c7-0058-4153-8098-38830ccaf23a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f791c7-0058-4153-8098-38830ccaf23a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-189e845b-783c-4ca4-982a-0779831860e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-189e845b-783c-4ca4-982a-0779831860e1
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-189e845b-783c-4ca4-982a-0779831860e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-be43dca9-2596-4c4d-b8e4-f3c40761ff3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be43dca9-2596-4c4d-b8e4-f3c40761ff3b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-be43dca9-2596-4c4d-b8e4-f3c40761ff3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3595860-d129-4133-958d-897c0e86f693

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3595860-d129-4133-958d-897c0e86f693
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3595860-d129-4133-958d-897c0e86f693
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e662e2d-d0e8-4243-a4aa-e86418b98386

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e662e2d-d0e8-4243-a4aa-e86418b98386
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e662e2d-d0e8-4243-a4aa-e86418b98386
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e069071-d5f6-4062-b9e1-c1df5c87c6cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e069071-d5f6-4062-b9e1-c1df5c87c6cd
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e069071-d5f6-4062-b9e1-c1df5c87c6cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c24a5bc-5cfc-4545-a7e3-ab1d81caeca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c24a5bc-5cfc-4545-a7e3-ab1d81caeca8
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c24a5bc-5cfc-4545-a7e3-ab1d81caeca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf54294e-f46b-4c80-ae7a-bcf694acb5ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf54294e-f46b-4c80-ae7a-bcf694acb5ff
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf54294e-f46b-4c80-ae7a-bcf694acb5ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d63954f-04d5-48eb-9c58-fabb091e7e56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d63954f-04d5-48eb-9c58-fabb091e7e56
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d63954f-04d5-48eb-9c58-fabb091e7e56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b8ff84d-cdaf-46e5-acc1-a930e6025654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b8ff84d-cdaf-46e5-acc1-a930e6025654
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b8ff84d-cdaf-46e5-acc1-a930e6025654
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-673c3d4b-be78-4160-b87b-0ff4b010ade1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-673c3d4b-be78-4160-b87b-0ff4b010ade1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-673c3d4b-be78-4160-b87b-0ff4b010ade1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-e30cf906-fa04-46d9-9ba2-906ae9b9a44f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e30cf906-fa04-46d9-9ba2-906ae9b9a44f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e30cf906-fa04-46d9-9ba2-906ae9b9a44f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-b86b75eb-2206-40ba-9618-70a7ad2c2b6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b86b75eb-2206-40ba-9618-70a7ad2c2b6e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b86b75eb-2206-40ba-9618-70a7ad2c2b6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-24b1c798-e9ee-4ce7-8150-5170c165a8e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24b1c798-e9ee-4ce7-8150-5170c165a8e8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-24b1c798-e9ee-4ce7-8150-5170c165a8e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-d048114e-be2c-46e3-963c-e158db80ef7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d048114e-be2c-46e3-963c-e158db80ef7a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d048114e-be2c-46e3-963c-e158db80ef7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-40bb9506-d1dc-4663-8c57-acae649d08e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40bb9506-d1dc-4663-8c57-acae649d08e4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-40bb9506-d1dc-4663-8c57-acae649d08e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a0b8329-4600-48af-9d0f-5c9e3e8ecf2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0b8329-4600-48af-9d0f-5c9e3e8ecf2f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0b8329-4600-48af-9d0f-5c9e3e8ecf2f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f291333-18fa-4eb2-ae0b-7d18495f2679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f291333-18fa-4eb2-ae0b-7d18495f2679
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f291333-18fa-4eb2-ae0b-7d18495f2679
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ce88273-e144-47b4-b1f1-377bf84e9213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce88273-e144-47b4-b1f1-377bf84e9213
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce88273-e144-47b4-b1f1-377bf84e9213
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e582a910-b658-4971-a84f-1c5c66050deb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e582a910-b658-4971-a84f-1c5c66050deb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-e582a910-b658-4971-a84f-1c5c66050deb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c11e21b-fd84-4993-9ac8-c7b94cc6c71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c11e21b-fd84-4993-9ac8-c7b94cc6c71b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c11e21b-fd84-4993-9ac8-c7b94cc6c71b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-65f54ff7-3a88-4613-9c68-67e0ef231a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f54ff7-3a88-4613-9c68-67e0ef231a2c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f54ff7-3a88-4613-9c68-67e0ef231a2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b84b617-db24-42d5-88fe-b32f17ee8eca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b84b617-db24-42d5-88fe-b32f17ee8eca
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b84b617-db24-42d5-88fe-b32f17ee8eca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d346ec0-3278-41c9-b93a-31dbc5a8cceb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d346ec0-3278-41c9-b93a-31dbc5a8cceb
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d346ec0-3278-41c9-b93a-31dbc5a8cceb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-7467418d-c234-443a-a114-db21017aabeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7467418d-c234-443a-a114-db21017aabeb
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-7467418d-c234-443a-a114-db21017aabeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-431c58db-5082-4bab-a845-86da48d86d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431c58db-5082-4bab-a845-86da48d86d7b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-431c58db-5082-4bab-a845-86da48d86d7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-17b550cf-cd43-4752-bc88-827535e90e43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b550cf-cd43-4752-bc88-827535e90e43
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b550cf-cd43-4752-bc88-827535e90e43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-b948ef5c-61dc-4120-81af-afdfefb04b5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b948ef5c-61dc-4120-81af-afdfefb04b5e
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b948ef5c-61dc-4120-81af-afdfefb04b5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-f816dc7d-1fb7-426f-a439-69d11338ec7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f816dc7d-1fb7-426f-a439-69d11338ec7c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-f816dc7d-1fb7-426f-a439-69d11338ec7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ba68dc2-bd6e-4f77-b339-b66c184a52b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ba68dc2-bd6e-4f77-b339-b66c184a52b7
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ba68dc2-bd6e-4f77-b339-b66c184a52b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-b09635f2-b7b4-4a8d-80eb-cd0269faace7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b09635f2-b7b4-4a8d-80eb-cd0269faace7
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-b09635f2-b7b4-4a8d-80eb-cd0269faace7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac17842c-5a8f-4416-b542-669aac6e6e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac17842c-5a8f-4416-b542-669aac6e6e5f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac17842c-5a8f-4416-b542-669aac6e6e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d51ebdf-4190-40a8-b6e4-95d16dc4c59f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d51ebdf-4190-40a8-b6e4-95d16dc4c59f
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d51ebdf-4190-40a8-b6e4-95d16dc4c59f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-81ff7458-7fc5-41ec-ae13-034582815384

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ff7458-7fc5-41ec-ae13-034582815384
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81ff7458-7fc5-41ec-ae13-034582815384
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-81ff7458-7fc5-41ec-ae13-034582815384"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdee58fa-5152-4447-bde4-d313d1373842

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdee58fa-5152-4447-bde4-d313d1373842
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdee58fa-5152-4447-bde4-d313d1373842
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cdee58fa-5152-4447-bde4-d313d1373842"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dc37b30-3993-4e93-bddd-710daf69b666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dc37b30-3993-4e93-bddd-710daf69b666
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dc37b30-3993-4e93-bddd-710daf69b666
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5dc37b30-3993-4e93-bddd-710daf69b666"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-d296e4e0-1ff7-4e9f-97ed-1a289952522a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d296e4e0-1ff7-4e9f-97ed-1a289952522a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d296e4e0-1ff7-4e9f-97ed-1a289952522a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d296e4e0-1ff7-4e9f-97ed-1a289952522a"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ef6edc4-4665-4c64-b38a-975bdf6ebfb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef6edc4-4665-4c64-b38a-975bdf6ebfb2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ef6edc4-4665-4c64-b38a-975bdf6ebfb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7ef6edc4-4665-4c64-b38a-975bdf6ebfb2"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-7004c140-9274-4c21-b0e5-b7daf66a4be1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7004c140-9274-4c21-b0e5-b7daf66a4be1
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7004c140-9274-4c21-b0e5-b7daf66a4be1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7004c140-9274-4c21-b0e5-b7daf66a4be1"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-b18ec2c9-08f8-438b-a7c3-656252397aad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b18ec2c9-08f8-438b-a7c3-656252397aad
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b18ec2c9-08f8-438b-a7c3-656252397aad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b18ec2c9-08f8-438b-a7c3-656252397aad"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e2b7e49-a2dd-4883-94b8-2bbd3411918b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2b7e49-a2dd-4883-94b8-2bbd3411918b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e2b7e49-a2dd-4883-94b8-2bbd3411918b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5e2b7e49-a2dd-4883-94b8-2bbd3411918b"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-628afcec-685e-4d3c-bf2c-5e0ae06189d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-628afcec-685e-4d3c-bf2c-5e0ae06189d2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-628afcec-685e-4d3c-bf2c-5e0ae06189d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-628afcec-685e-4d3c-bf2c-5e0ae06189d2"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f938386-3ae7-4a86-893e-8d5f77010343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f938386-3ae7-4a86-893e-8d5f77010343
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f938386-3ae7-4a86-893e-8d5f77010343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8f938386-3ae7-4a86-893e-8d5f77010343"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-d07873b1-6a85-4d98-b3db-876bd55cdf21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d07873b1-6a85-4d98-b3db-876bd55cdf21
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d07873b1-6a85-4d98-b3db-876bd55cdf21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d07873b1-6a85-4d98-b3db-876bd55cdf21"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-976e5492-2661-4016-90df-b91057e44fbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-976e5492-2661-4016-90df-b91057e44fbe
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-976e5492-2661-4016-90df-b91057e44fbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-976e5492-2661-4016-90df-b91057e44fbe"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-b66388a1-c5d1-4cab-addc-dee7e8c9d083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b66388a1-c5d1-4cab-addc-dee7e8c9d083
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b66388a1-c5d1-4cab-addc-dee7e8c9d083
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b66388a1-c5d1-4cab-addc-dee7e8c9d083"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-787aaeca-c70c-4aa7-9786-a9a4db9eb4f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-787aaeca-c70c-4aa7-9786-a9a4db9eb4f2
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-787aaeca-c70c-4aa7-9786-a9a4db9eb4f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-787aaeca-c70c-4aa7-9786-a9a4db9eb4f2"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-d7daa932-36b3-4f25-9e83-c533f94205f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7daa932-36b3-4f25-9e83-c533f94205f3
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d7daa932-36b3-4f25-9e83-c533f94205f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d7daa932-36b3-4f25-9e83-c533f94205f3"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-88066c94-b97c-424f-b1a0-78be3188758b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88066c94-b97c-424f-b1a0-78be3188758b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88066c94-b97c-424f-b1a0-78be3188758b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-88066c94-b97c-424f-b1a0-78be3188758b"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-49318614-93b5-4c98-a3f7-0379dabf9c76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49318614-93b5-4c98-a3f7-0379dabf9c76
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49318614-93b5-4c98-a3f7-0379dabf9c76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-49318614-93b5-4c98-a3f7-0379dabf9c76"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4e6d6f0-206c-43d0-b73e-0877b1eba9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4e6d6f0-206c-43d0-b73e-0877b1eba9d0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Sun, 25 Oct 2026 07:40:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4e6d6f0-206c-43d0-b73e-0877b1eba9d0
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
Content-Length: 181

{"id":"acc_4656401f-3271-488f-b12b-812fa0549bd4","handle":"qa-0c6547c69bfc","displayName":"QA 0c6547c69bfc","region":"eu","role":"user","createdAt":"2026-10-25T07:40:28.986167765Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aba60a04-6e21-4639-b891-87ff889cbe3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aba60a04-6e21-4639-b891-87ff889cbe3c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aba60a04-6e21-4639-b891-87ff889cbe3c
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

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-599837aa-4445-47de-a483-480cf7c9c522

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-599837aa-4445-47de-a483-480cf7c9c522
Content-Type: application/json

--- request body ---
{"handle":"qa-0c6547c69bfc","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-599837aa-4445-47de-a483-480cf7c9c522
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-599837aa-4445-47de-a483-480cf7c9c522"}
```
